package tests;

import uutf.TestCase;

import static uutf.Assertions.assertEquals;

public class ThrowAnException extends TestCase {
    int x = 1;
    int y = 1;

    @Override
    protected void test() {
        throw new RuntimeException("Boom!");
    }

}
