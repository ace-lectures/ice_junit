package uutf;

import java.lang.reflect.Method;

public class AnnotationScanner extends TestFactory {

    @Override
    protected boolean isATestMethod(Method m) {
        return null != m.getDeclaredAnnotation(TestMethod.class);
    }
}
