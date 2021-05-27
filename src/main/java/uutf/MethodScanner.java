package uutf;

import java.lang.reflect.Method;

public class MethodScanner extends TestFactory {

    private static final String METHOD_PREFIX = "test_";

    @Override
    protected boolean isATestMethod(Method m) {
        return m.getName().startsWith(METHOD_PREFIX);
    }
}
