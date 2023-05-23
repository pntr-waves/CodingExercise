package truong.exercise1000.controlstructure.e83;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import truong.exercise1000.controlstructure.data.TestingDataModule;
import truong.exercise1000.controlstructure.e83.E83Service.E83Service;
import truong.exercise1000.util.core.ITransformer;
import truong.exercise1000.util.model.dto.CacheMapping;
import truong.exercise1000.util.support.DataUtil;

public class App {
    public static void main(String[] args) {
        /*
            83. Write a program:print 2 array with:
            array include numbers are greater than 0
            and less than 0
        */
        E83Service service = new E83Service();
        List<Double> numbers = TestingDataModule.getRandomNumbers();
        for (Double n : numbers) {
            System.out.println(n);
        }
        CacheMapping<Long, List<Double>> mapping = new CacheMapping<Long, List<Double>>() {
            @Override
            public List<Double> getByKey(Long key, List<Double> input) {
                List<Double> results = new ArrayList<Double>();
                for(Double d : input) {
                    if (d < 0) results.add(d);
                }
                return results;
            }
        };
        mapping.buildCacheMappingData(1l, numbers);
        for (Long key : mapping.cacheMappingData.keySet()) {
            for (Double d : mapping.cacheMappingData.get(key)) {
                System.out.println("from cache item: " + d);
            }
        }

        List<Double> dList = DataUtil.transform(numbers, new ITransformer<Double, Double>() {
            @Override
            public Double transform(Double input) {
                if (input > 0) return input;
                return null;
            }
        });

    }
}
