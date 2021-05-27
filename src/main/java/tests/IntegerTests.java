package tests;

import uutf.TestCase;
import uutf.TestSuite;

import static uutf.Assertions.assertEquals;

public class IntegerTests extends TestSuite {

    public IntegerTests() {
        this.addCase(new AddTwoNumbers());
        this.addCase(new SubtractTwoNumbers());
        this.addCase(new ThrowAnException());
    }

    private static class AddTwoNumbers extends TestCase {
        private int x, y = 0;

        @Override
        protected void setUp() { x = 1; y = 1; }

        @Override
        protected void test() {
            assertEquals(42, x+y);
        }

    }

    private static class SubtractTwoNumbers extends TestCase {
        private int x, y = 0;

        @Override
        protected void setUp() { x = 1; y = 1; }

        @Override
        protected void test() {
            assertEquals(0, x-y);
        }

    }

    private static class ThrowAnException extends TestCase {
        int x = 1;
        int y = 1;

        @Override
        protected void test() {
            throw new RuntimeException("Boom!");
        }

    }

}
