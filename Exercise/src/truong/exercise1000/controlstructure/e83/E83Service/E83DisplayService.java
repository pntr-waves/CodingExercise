package truong.exercise1000.controlstructure.e83.E83Service;

import java.util.List;

public class E83DisplayService {
    public static void printListNumber(List<Double> input, String title) {
        if (input == null) {
            System.out.println("Input is null!");
            return;
        }
        for (Double d : input) {
            System.out.println(String.format("%s %.2f", title, d));
        }
        System.out.println("\n\n");
    }

}
