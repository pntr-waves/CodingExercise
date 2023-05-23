package truong.exercise1000.controlstructure.e83;

import java.util.List;
import java.util.Map;

import truong.exercise1000.controlstructure.data.TestingDataModule;
import truong.exercise1000.controlstructure.e83.E83Service.E83DisplayService;
import truong.exercise1000.controlstructure.e83.E83Service.E83Service;

public class App {
    public static void main(String[] args) {
        /*
            83. Write a program:print 2 array with:
            array include numbers are greater than 0
            and less than 0
        */
        E83Service service = new E83Service();
        List<Double> numbers = TestingDataModule.getRandomNumbers();
        Map<String, List<Double>> results = service.getNumberMap(numbers);
        E83DisplayService.printListNumber(numbers, "Input Number Item: ");
        E83DisplayService.printListNumber(results.get(E83Service.POSITIVE_NUMBER_KEY), "Positive Number Item: ");
        E83DisplayService.printListNumber(results.get(E83Service.NEGATIVE_NUMBER_KEY), "Negative Number Item: ");
    }
}
