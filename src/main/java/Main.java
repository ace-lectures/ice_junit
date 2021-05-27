import tests.AddTwoNumbers;
import tests.IntegerTests;
import uutf.TestRunner;

public class Main {


    public static void main(String[] args) {

        System.out.println("Demo Junit");
        TestRunner runner = new TestRunner();
        runner.runAndPrint(IntegerTests.build());

        System.out.println("Retrocompatibilité");
        runner = new TestRunner();
        runner.runAndPrint(new AddTwoNumbers());

    }

}
