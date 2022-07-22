package truong.e1000.arraytechnique.integerarray.searchandlistexercise.service;

public class SearchAndListExerciseIntegerArrayService {
    public int[] getNegativeItem (int[] array) {
        int count = countNegativeItem(array);
        int[] result = new int[count];
        int index = 0;
        for (int i : array) {
            if (i < 0) result[index] = i;
            index++;
        }
        
        return result;
    }
    
    public int countNegativeItem (int[] array) {
        int result = 0;
        for (int i : array) {
            if (i < 0) result++;
        }
        
        return result;
    }
}
