package tests;

import static uutf.Assertions.*;

import uutf.SingleTestCase;

public class AddTwoNumbers extends SingleTestCase {
    int x = 1;
    int y = 1;

    @Override
    public void test() {
        assertEquals(2, x+y);
    }

}
