package uutf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class TestCase implements Test {

    private String testMethod;
    public final TestCase initialize(String m){
        testMethod = m;
        return this;
    }

    public final void run(ResultCollector c) {
        TestResult result =
                new TestResult(this.getClass().getCanonicalName()+"::"+testMethod);
        try {
            setUp();
            invokeTestMethod();
            result.setStatus(STATUS.PASSED);
        } catch(InvocationTargetException iae) {
            try {
                throw iae.getTargetException();
            } catch (AssertionError e) {
                result.setStatus(STATUS.FAILED);
            } catch (Throwable e) {
                result.setStatus(STATUS.ERRORED);
            }
        } catch (NoSuchMethodException|IllegalAccessException e) {
                result.setStatus(STATUS.ERRORED);
        }
        finally { tearDown(); }
        c.addResult(result);
    }

    private void invokeTestMethod()
            throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException  {
        Method test = this.getClass().getMethod(testMethod);
        test.invoke(this);
    }


    protected void setUp() { };     // override si besoin
    protected void tearDown() { };  // override si besoin
}
