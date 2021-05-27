package tests;

import uutf.TestCase;
import uutf.TestSuite;

import static uutf.Assertions.assertEquals;

public class IntegerTests extends TestCase {

    private int x, y = 0;
    @Override protected void setUp() { x = 1; y = 1; }

    public void addTwoNumbers() { assertEquals(42, x+y); }
    public void subtractTwoNumbers() { assertEquals(0, x-y); }
    public void throwAnException() { throw new RuntimeException("Boom!"); }


    // Objectif: dégager ça
    public static TestSuite build() {
        TestSuite suite = new TestSuite();
        suite.addCase(new IntegerTests().initialize("addTwoNumbers"));
        suite.addCase(new IntegerTests().initialize("subtractTwoNumbers"));
        suite.addCase(new IntegerTests().initialize("throwAnException"));
        return suite;
    }



}
