package uutf;


public class TestRunner {

    public ResultCollector run(Test t) {
        ResultCollector c = new ResultCollector();
        t.run(c);
        return c;
    }
    public void runAndPrint(Test t) {
        System.out.println(this.run(t));
    }
}
