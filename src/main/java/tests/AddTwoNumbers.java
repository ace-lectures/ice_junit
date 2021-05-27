package tests;
import static uutf.Assertions.*;
import uutf.TestCase;

public class AddTwoNumbers extends TestCase {
    int x = 1;
    int y = 1;

    @Override
    protected void test() {
        assertEquals(42, x+y);
    }

}
