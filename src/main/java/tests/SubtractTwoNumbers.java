package tests;

import uutf.TestCase;

import static uutf.Assertions.assertEquals;

public class SubtractTwoNumbers extends TestCase {
    int x = 1;
    int y = 1;

    @Override
    protected void test() {
        assertEquals(0, x-y);
    }

}
