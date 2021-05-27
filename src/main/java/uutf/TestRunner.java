package uutf;

import java.util.*;

public class TestRunner {

    private Set<TestCase> cases = new HashSet<>();
    public void addCase(TestCase t) {
        cases.add(t);
    }

    public void run() {
        Map<STATUS, Integer> counters = new HashMap<>();
        Set<TestResult> results = new HashSet<>();
        for(TestCase t: cases) {
            TestResult r = t.run();
            counters.put(r.getStatus(),
                    counters.getOrDefault(r.getStatus(),0)+1);
            results.add(r);
        }
        results.forEach(System.out::println);
        System.out.println(counters);
    }

}
