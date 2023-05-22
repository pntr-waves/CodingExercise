package truong.exercise1000.util.model.dto;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import truong.exercise1000.util.core.ITransformer;

public class CacheMapping<T, V extends Collection> {
    public Map<T, V> cacheMappingData;

    public CacheMapping () {
        cacheMappingData = new HashMap<T, V>();
    }

    public void buildCacheMappingData(List<V> input, ITransformer<T, V> transformer) {
        for (V v : input) {
            T key = transformer.transform(v);
            V value = cacheMappingData.get(key);
            value.add(v);
        }
    }

}
