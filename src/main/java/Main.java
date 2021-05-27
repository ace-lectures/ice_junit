import tests.AddTwoNumbers;
import tests.IntegerTests;
import uutf.TestFactory;
import uutf.TestRunner;

public class Main {


    public static void main(String[] args) {

        System.out.println("Demo Junit");
        TestRunner runner = new TestRunner();
        TestFactory scanner = new TestFactory();
        runner.runAndPrint(scanner.scan(IntegerTests.class));

        System.out.println("Retrocompatibilité");
        runner = new TestRunner();
        runner.runAndPrint(new AddTwoNumbers());

    }

}
