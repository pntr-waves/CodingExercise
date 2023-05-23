package truong.exercise1000.util.model.dto;

import java.util.HashMap;
import java.util.Map;

public abstract class CacheMapping<T, V> {
    public Map<T, V> cacheMappingData;

    public CacheMapping () {
        cacheMappingData = new HashMap<T, V>();
    }

    public void buildCacheMappingData(T key, V input) {
        V value = getByKey(key, input);
        cacheMappingData.put(key, value);
    }

    public abstract V getByKey(T key, V input);
}
