package truong.exercise1000.controlstructure.e83.E83Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E83Service {
    public static final String POSITIVE_NUMBER_KEY = "POSITIVE_NUMBER_KEY";
    public static final String NEGATIVE_NUMBER_KEY = "NEGATIVE_NUMBER_KEY";

    public Map<String, List<Double>> getNumberMap(List<Double> input) {
        Map<String, List<Double>> results = new HashMap<>();
        for (Double d : input) {
            if (results.get(POSITIVE_NUMBER_KEY) == null) results.put(POSITIVE_NUMBER_KEY, new ArrayList<Double>());
            if (results.get(NEGATIVE_NUMBER_KEY) == null) results.put(NEGATIVE_NUMBER_KEY, new ArrayList<Double>());
            if (d > 0) results.get(POSITIVE_NUMBER_KEY).add(d);
            if (d < 0) results.get(NEGATIVE_NUMBER_KEY).add(d);
        }
        return results;
    }
}
