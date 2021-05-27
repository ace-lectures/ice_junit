import static uutf.Assertions.*;

public class Main {


    public static void main(String[] args) {
        System.out.println("Demo Junit");

        try {
            int x = 1;
            int y = 1;
            assertEquals(2, x + y);
            System.out.println("SUCCESS");
        }catch (AssertionError e){
            System.out.println("FAIL");
        }

        try {
            int x = 1;
            int y = 1;
            assertEquals(0, x - y);
            System.out.println("SUCCESS");
        }catch (AssertionError e){
            System.out.println("FAIL");
        }

    }

}
