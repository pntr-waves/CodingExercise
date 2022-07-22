package truong.e1000.arraytechnique.integerarray.searchandlistexercise.data;

import java.util.Random;

public class IntegerArrayDataTestingBuilder {
    public static int[] getIntegerArray () {
        int[] array = new int[100];
        int index = 0;
        Random r = new Random();
        while (index < 100) {
            int num = r.nextInt(150) - 60;
            array[index] = num;
            index++;
        }
        
        return array;
    }
}
