/**
 * 122. Find max in array.
 * 123. Find index whose value is minimum in array.
 * 124. Check array has value is less than 50.
 * 125. Count item is prime number and less than 60.
 * 126. Calculation total item in array.
 * 127. Sort array with order is ascending.
 * 132. List value is even item
 * 133. List index is odd item
 * 135. Find first positive item, if array have not any positive item, return -1
 * 136. Find last even item, if array have not any even item, return -1
 * 138. Find index of first even item, if array have not any even item, return -1
 * 139. Find index of last perfect number item, if array have not any item like this, return -1
 * 143. Find first even item, if not return -1
 * 144. Find first prime item, if not return -1
 * 145. Find first perfect item, if not return -1
 * 148. Find last perfect item, if not return -1
 * 149. Find last prime item, if not return -1
 * 151. Find max prime item, if not return 0
 * 152. Find min perfect item, if not return 0
 * 155. Find item has max distance with 15
 * 156. Find index has max distance with 94
 * 157. Find [a,b] has all item in array
 * 158. Find x with [-x,x] contains all item in array
 * 159. Find first item greater than 70
 * 161. Find first item in (x,y). If not return x
 * 162. Find index with requirements: this index has value around, and value = multiplication of around values
 * 163. Find first perfect square number
 * 165. Find first item has first character is odd number
 * 166. Find first item has form is 2^k
 * 167. Find max item has all character is odd number
 * 169. Find max odd item and it less than even odd item
 * 173. Find the least appearing digit
 */

package truong.e1000.arraytechnique.integerarray.basisexercise;

import truong.e1000.arraytechnique.integerarray.basisexercise.data.IntegerArrayBasisExerciseDataTestingBuilder;
import truong.e1000.arraytechnique.integerarray.basisexercise.service.IntegerArrayBasisExerciseDisplayService;
import truong.e1000.arraytechnique.integerarray.basisexercise.service.IntegerArrayBasisExerciseService;

public class IntegerArrayBasisExerciseApp {
    public static void main(String[] args) {
        int[] integerArray = IntegerArrayBasisExerciseDataTestingBuilder.getIntegerArray();
        IntegerArrayBasisExerciseService service = new IntegerArrayBasisExerciseService();
        IntegerArrayBasisExerciseDisplayService display = new IntegerArrayBasisExerciseDisplayService();
        
        System.out.println("Max item in array: " + service.getMax(integerArray));
        
        int minIndex = service.getIndexMin(integerArray);
        System.out.println("\nIndex has min item in array: " +  minIndex + " -> " + integerArray[minIndex]);
        
        int limitedNumber = 50;
        System.out.println("\nArray has item < " + limitedNumber + ": " + (service.checkExistWithLimit(integerArray, limitedNumber) ? "Exist" : "Not Exist"));
        
        limitedNumber = 60;
        System.out.println("\nHas item is Prime Number and less than " + limitedNumber + ": " + service.countPrimeWithLimit(integerArray, limitedNumber));
        
        System.out.println("\nTotal Item: " + service.getTotal(integerArray));
        
        System.out.println("\nList Item: ");
        service.sort(integerArray);
        display.printAllItem(integerArray);
        
        System.out.println("\nList Even Item: ");
        display.printAllItem(service.getListEvenItem(integerArray));
        
        System.out.println("\nList Index whose value is odd number: ");
        display.printAllItem(service.getListIndexOfOddItem(integerArray));
        
        System.out.println("\nFirst Positive Item: " + (service.findFirstPositiveItem(integerArray) == -1 ? "No result" : service.findFirstPositiveItem(integerArray) ));
        
        int lastEvenNumber = service.findLastEventItem(integerArray);
        System.out.println("\nLast Even Item: " + (lastEvenNumber == -1 ? "No result" : lastEvenNumber));
        
        int firstEvenIndex = service.getIndexOfFirstEvenItem(integerArray);
        System.out.println("\nIndex of First Even Item: " + (firstEvenIndex == -1 ? "No result" : firstEvenIndex));
        
        int perfectIndex = service.getIndexOfLastPerfectItem(integerArray);
        System.out.println("\nIndex of Last Perfect Item: " + (perfectIndex == -1 ? "No result" : perfectIndex + " -> " + integerArray[perfectIndex]));
        
        int firstEvenNumber = service.getFirstEvenItem(integerArray);
        System.out.println("\nFirst Even Item: " + (firstEvenNumber == -1 ? "No result" : firstEvenNumber));
        
        int firstPrimeNumber = service.getFirstPrime(integerArray);
        System.out.println("\nFirst Prime Number Item: " + (firstPrimeNumber == -1 ? "No result" : firstPrimeNumber));
        
        int firstPerfectNumber = service.getFirstPerfectNumberItem(integerArray);
        System.out.println("\nFirst Perfect Number Item: " + (firstPerfectNumber == -1 ? "No result" : firstPerfectNumber));
        
        int lastPerfectNumber = service.getLastPerfectNumberItem(integerArray);
        System.out.println("\nLast Perfect Number Item: " + (lastPerfectNumber == -1 ? "No result" : lastPerfectNumber));
        
        int lastPrimeNumber = service.getLastPrime(integerArray);
        System.out.println("\nLast Prime Number Item: " + (lastPrimeNumber == -1 ? "No result" : lastPrimeNumber));
        
        int maxPrime = service.getMaxPrime(integerArray);
        System.out.println("\nMax Prime Number Item: " + (maxPrime == 0 ? "No result" : maxPrime));
        
        int minPerfect = service.getMinPerfectNumberItem(integerArray);
        System.out.println("\nMin Perfect Number Item: " + (minPerfect == 0 ? "No result" : minPerfect));
        
        int distanceNumber = 15;
        int maxDistanceItem = service.getItemByDistanceWithNumber(integerArray, distanceNumber);
        System.out.println("\nMax distance with " + distanceNumber + " at item = " + maxDistanceItem);
        
        distanceNumber = 94;
        int maxDistanceIndex = service.getIndexByDistanceWithNumber(integerArray, distanceNumber);
        System.out.println("\nMax distance with " + distanceNumber + " at index = " + maxDistanceIndex);
        
        int max = service.getMax(integerArray), min = service.getMin(integerArray);
        System.out.println("\nAll array item in [" + min + "," + max + "]" );
        
        int absMax = service.getAbsMax(integerArray);
        System.out.println(String.format("\n[-%d,%d] contains all item in array", absMax, absMax));
        
        limitedNumber = 70;
        int result = service.getFirstItemGreaterThanLimitedNumber(integerArray, limitedNumber);
        System.out.println("\nFirst Item is greater than " + limitedNumber + " : " + (result == -1 ? "No result" : result) );
        
        int minRange = 32;
        int maxRange = 49;
        result = service.getFirstItemByRange(integerArray, minRange, maxRange);
        System.out.println(String.format("\nFirst Item in range (%d,%d): %d", minRange, maxRange, result));
        
        int indexResult = service.getIndexByValueAround(integerArray);
        System.out.println("\nIndex has value around and value = multiplication of around values: " + (indexResult == -1 ? "No result" : indexResult) 
                + " -> " 
                + "[" + integerArray[indexResult] + "]");
        
        int firstPerfectSquare = service.getFirstPerfectSquareItem(integerArray);
        System.out.println("\nFirst perfect square: " + (firstPerfectSquare == -1 ? "No result" : firstPerfectSquare));
        
        int firstOddCharNumber = service.getFirstItemHasFirstOddDigit(integerArray);
        System.out.println("\nFirst item has first digit is odd number: " + (firstOddCharNumber == -1 ? "No result" : firstOddCharNumber));

        int first2PowFromNumber = service.getFirstItemHas2PowForm(integerArray);
        System.out.println("\nFirst Item has form is 2^k: " + (first2PowFromNumber == -1 ? "No result" : first2PowFromNumber));

        int maxAllOddCharNumber = service.getMaxItemHasOddAllDigit(integerArray);
        System.out.println("\nMax Item has all odd digit: " + (maxAllOddCharNumber == 0 ? "No result" : maxAllOddCharNumber));
        
        result = service.getMaxOddItemByMinEvenItem(integerArray);
        System.out.println("\nMax Odd item is less than min even item: " + (result == Integer.MIN_VALUE ? "No result" : result));
        
        result = service.getLeastAppearingDigit(integerArray);
        System.out.println("The least appearing digit: " + result);
    }
}
