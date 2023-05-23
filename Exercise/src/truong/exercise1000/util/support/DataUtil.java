package truong.exercise1000.util.support;

import java.util.ArrayList;
import java.util.List;

import truong.exercise1000.util.core.ITransformer;

public class DataUtil {
    public static <V, T> List<V> transform(List<T> input, ITransformer<V, T> transformer) {
        List<V> results = new ArrayList<V>();
        if (input == null) return results;
        for (T i : input) {
            V r = transformer.transform(i);
            if (r == null) continue;
            results.add(r);
        }
        return results;
    }
}
