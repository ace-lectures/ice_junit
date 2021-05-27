package uutf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestFactory {

    private static final String METHOD_PREFIX = "test_";

    public Test scan(Class klass){
        if(! isATestCase(klass))
            throw new IllegalArgumentException(klass.getCanonicalName() + " is not a test class");
        return extractTestCases(klass);
    }

    private Test extractTestCases(Class klass) {
        TestSuite suite = new TestSuite();
        for(Method m: klass.getMethods()){
            if(m.getName().startsWith(METHOD_PREFIX)){
                try {
                    buildTestCase(klass, m, suite);
                } catch (Exception e) {
                    System.err.println(e);
                    continue;
                }
            }
        }
        return suite;
    }

    private void buildTestCase(Class klass, Method m, TestSuite suite)
            throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {
        // suite.addCase(new IntegerTests().initialize("test_addTwoNumbers"));
        TestCase test = (TestCase) klass.getDeclaredConstructor().newInstance();
        suite.addCase(test.initialize(m.getName()));
    }

    private boolean isATestCase(Class klass) {
        return TestCase.class.isAssignableFrom(klass);
    }

}
