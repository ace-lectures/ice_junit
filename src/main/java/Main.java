import tests.AddTwoNumbers;
import tests.SubtractTwoNumbers;
import tests.ThrowAnException;
import uutf.TestRunner;

import static uutf.Assertions.*;

public class Main {


    public static void main(String[] args) {
        System.out.println("Demo Junit");
        TestRunner runner = new TestRunner();

        runner.addCase(new AddTwoNumbers()); // Command
        runner.addCase(new SubtractTwoNumbers());
        runner.addCase(new ThrowAnException());

        runner.run();
    }

}
