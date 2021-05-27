import tests.AddTwoNumbers;
import tests.SubtractTwoNumbers;
import tests.ThrowAnException;

import static uutf.Assertions.*;

public class Main {


    public static void main(String[] args) {
        System.out.println("Demo Junit");
        (new AddTwoNumbers()).run();
        (new SubtractTwoNumbers()).run();
        (new ThrowAnException()).run();
    }

}
