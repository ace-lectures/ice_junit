import tests.AddTwoNumbers;
import tests.IntegerTests;
import tests.IntegerTestsAnnotated;
import uutf.AnnotationScanner;
import uutf.MethodScanner;
import uutf.TestFactory;
import uutf.TestRunner;

public class Main {


    public static void main(String[] args) {

        System.out.println("Demo Junit - Methodes");
        TestRunner runner = new TestRunner();
        TestFactory scanner = new MethodScanner();
        runner.runAndPrint(scanner.scan(IntegerTests.class));

        System.out.println("Demo Junit - Annotations");
        runner = new TestRunner();
        TestFactory annotatedScanner = new AnnotationScanner();
        runner.runAndPrint(annotatedScanner.scan(IntegerTestsAnnotated.class));

        System.out.println("Retrocompatibilité");
        runner = new TestRunner();
        runner.runAndPrint(new AddTwoNumbers());

    }

}
