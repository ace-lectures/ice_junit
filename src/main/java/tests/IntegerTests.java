package tests;

import uutf.TestCase;
import uutf.TestSuite;

import static uutf.Assertions.assertEquals;

public class IntegerTests extends TestCase {

    private int x, y = 0;
    @Override protected void setUp() { x = 1; y = 1; }

    public void test_addTwoNumbers() { assertEquals(42, x+y); }
    public void test_subtractTwoNumbers() { assertEquals(0, x-y); }
    public void test_throwAnException() { throw new RuntimeException("Boom!"); }


}
