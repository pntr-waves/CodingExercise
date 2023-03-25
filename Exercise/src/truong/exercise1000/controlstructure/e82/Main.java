package truong.exercise1000.controlstructure.e82;

import java.util.List;

import truong.exercise1000.controlstructure.data.TestingDataModule;
import truong.exercise1000.controlstructure.e82.E82Service.E82DisplayService;

public class Main {
    //82. Write the program: get max number in list.
    public static void main(String[] args) {
        List<Double> numbers = TestingDataModule.getRandomNumbers();
        E82DisplayService display = new E82DisplayService();
        display.displayNumbers(numbers);
    }
}
