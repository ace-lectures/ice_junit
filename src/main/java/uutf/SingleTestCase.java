package uutf;

public abstract class SingleTestCase extends TestCase {

    private static final String DEFAULT_METHOD_NAME = "test";

    public SingleTestCase() { initialize(DEFAULT_METHOD_NAME); }

    protected abstract void test();

}
