package tests;

import uutf.TestCase;
import uutf.TestMethod;

import static uutf.Assertions.assertEquals;

public class IntegerTestsAnnotated extends TestCase {

    private int x, y = 0;
    @Override protected void setUp() { x = 1; y = 1; }

    @TestMethod
    public void addTwoNumbers() { assertEquals(42, x+y); }
    @TestMethod
    public void subtractTwoNumbers() { assertEquals(0, x-y); }
    @TestMethod
    public void throwAnException() { throw new RuntimeException("Boom!"); }


}
