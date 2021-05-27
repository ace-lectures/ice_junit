package uutf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ResultCollector {

    private Set<TestResult> results = new HashSet<>();
    public void addResult(TestResult r) {
        this.results.add(r);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Map<STATUS, Integer> counters = new HashMap<>();
        for(TestResult r: results){
            counters.put(r.getStatus(),
                    counters.getOrDefault(r.getStatus(),0)+1);
            builder.append(r).append("\n");
        }
        builder.append(counters);
        return builder.toString();

    }

}
