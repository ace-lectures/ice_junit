package uutf;

public class Assertions {

    // assertTrue
    public static void assertTrue(boolean b) {
        if(!b)
            throw new AssertionError();
    }

    public static void assertFalse(boolean b) {
        assertTrue(!b);
    }

    public static void assertEquals(int left, int right) {
        assertTrue(left == right);
    }

}
