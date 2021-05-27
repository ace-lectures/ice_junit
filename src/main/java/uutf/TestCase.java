package uutf;

public abstract class TestCase implements Test {

    public final void run(ResultCollector c) {
        TestResult result = new TestResult(this.getClass().getCanonicalName());
        try {
            setUp();
            test();
            result.setStatus(STATUS.PASSED);
        }catch (AssertionError e){
            result.setStatus(STATUS.FAILED);
        } catch (Exception e) {
            result.setStatus(STATUS.ERRORED);
        } finally {
            tearDown();
        }
        c.addResult(result);
    }

    protected void setUp() { };     // override si besoin
    protected abstract void test(); // Template Method
    protected void tearDown() { };  // override si besoin
}
