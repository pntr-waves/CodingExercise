package truong.e1000.arraytechnique.integerarray.searchandlistexercise;

import truong.e1000.arraytechnique.integerarray.searchandlistexercise.data.IntegerArrayDataTestingBuilder;
import truong.e1000.arraytechnique.integerarray.searchandlistexercise.service.SearchAndListExerciseIntegerArrayDisplayService;

public class SearchAndListExerciseIntegerArrayApp {
    public static void main(String[] args) {
        int[] integerArray = IntegerArrayDataTestingBuilder.getIntegerArray();
        SearchAndListExerciseIntegerArrayDisplayService display = new SearchAndListExerciseIntegerArrayDisplayService();
        
        display.printAll(integerArray);
    }
}
