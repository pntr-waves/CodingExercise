package truong.exercise1000.controlstructure.e83;

import java.util.Collection;
import java.util.List;

import truong.exercise1000.controlstructure.data.TestingDataModule;
import truong.exercise1000.controlstructure.e83.E83Service.E83Service;
import truong.exercise1000.util.model.dto.CacheMapping;

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
    }
}
