package uutf;

public abstract class TestCase {

    public final void run() {
        try {
            test();
            System.out.println("SUCCESS");
        }catch (AssertionError e){
            System.out.println("FAIL");
        }
    }

    protected abstract void test(); // Template Method

}
