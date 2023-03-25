package truong.exercise1000.controlstructure.e82.E82Service;

import java.util.List;

public class E82DisplayService {
    private static E82Service service = new E82Service();
    public void displayMaxNumbers(List<Double> numbers) {
        Double max = service.getMaxNumberInList(numbers);
        System.out.println(String.format("Max: %s", max));
    }

    public void displayNumbers(List<Double> numbers) {
        for (Double n : numbers) {
            System.out.print(String.format("[%s]", n) + "\t");
        }
        System.out.println("\n");
        displayMaxNumbers(numbers);
    }
}
