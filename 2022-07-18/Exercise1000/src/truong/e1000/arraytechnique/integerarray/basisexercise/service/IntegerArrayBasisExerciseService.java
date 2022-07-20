package truong.e1000.arraytechnique.integerarray.basisexercise.service;

import java.util.HashMap;
import java.util.Map;

public class IntegerArrayBasisExerciseService {
    public int getMax (int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) max = i;
        }
        
        return max;
    }
    
    public int getIndexMin (int[] array) {
        int index = 0;
        int min = array[index];
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                index = i;
                min = array[i];
            }
        }
        
        return index;
    }
    
    public boolean checkExistWithLimit (int[] array, int limitedNumber) {
        for (int i : array) {
            if (i <= limitedNumber) {
                return true;
            }
        }
        
        return false;
    }
    
    public int countPrimeWithLimit (int[] array, int limitedNumber) {
        int result = 0;
        for (int i : array) {
            if (i <= limitedNumber && checkPrime(i)) {
                result++;
            }
        }
        
        return result;
    }
    
    public boolean checkPrime (int number) {
        if (number <= 0) return false;
        
        if (number == 2) return true;
        
        if (number == 3) return true;
        
        for (int i = 4; i < Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        
        return true;
    }
    
    public int getTotal (int[] array) {
        int total = 0;
        for (int i : array) {
            total += i;
        }
        
        return total;
    }
    
    public void sort (int[] array) {
        quickSort(array, 0, array.length - 1);
    }
    
    public void quickSort (int[] array, int low, int high) {
        if (low < high) {
            int i = partition(array, low, high);
            quickSort(array, low, i - 1);
            quickSort(array, i + 1, high);
        }
    }
    
    public int partition (int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        int j = low;
        
        while (j < high) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            j++;
        }
        
        array[high] = array[i + 1];
        array[i + 1] = pivot;
        
        return i + 1;
    }
    
    public int[] getListEvenItem (int[] array) {
        int[] result = new int[countEvenItem(array)];
        int index = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                result[index] = i;
                index++;
            }
        }
        
        return result;
    }
    
    public int[] getListIndexOfOddItem (int[] array) {
        int[] result = new int[countOddItem(array)];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                result[index] = i;
                index++;
            }
        }
        
        return result;
    }
    
    public int countEvenItem (int[] array) {
        int result = 0;
        for (int i : array) {
            if (i % 2 == 0) result++;
        }
        
        return result;
    }
    
    public int countOddItem (int[] array) {
        int result = 0;
        for (int i : array) {
            if (i % 2 != 0) result++;
        }
        
        return result;
    }
    
    public int findFirstPositiveItem (int[] array) {
        for (int i : array) {
            if (i > 0) {
                return i;
            }
        }
        
        return -1;
    }
    
    public int findLastEventItem (int[] array) {
        int value = -1;
        
        for (int i : array) {
            if (i % 2 == 0) value = i;
        }
        
        return value;
    }
    
    public int getIndexOfFirstEvenItem (int[] array) {
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result = i;
                break;
            }
        }
        
        return result;
    }
    
    public int getIndexOfLastPerfectItem (int[] array) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (checkPerfectNumber(array[i])) {
                index = i;
            }
        }
        
        return index;
    }
    
    public boolean checkPerfectNumber (int number) {
        int sum = 1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                if (i * i != number) {
                    sum += i + number / i;
                } else {
                    sum += i;
                }
            }
        }
        
        if (sum == number && number != 1) {
            return true;
        }
        
        return false;
    }
    
    public int getFirstEvenItem (int[] array) {
        int result = -1;
        for (int i : array) {
            if (i % 2 == 0) {
                result = i;
                return result;
            }
            
        }
        
        return result;
    }

    public int getFirstPrime (int[] array) {
        int result = -1;
        for (int i : array) {
            if (checkPrime(i)) {
                result = i;
                return result;
            }
        }
        
        return result;
    }
    
    public int getFirstPerfectNumberItem (int[] array) {
        int result = -1;
        for (int i : array) {
            if (checkPerfectNumber(i)) {
                result = i;
                return result;
            }
        }
        
        return result;
    }
    
    public int getLastPerfectNumberItem (int[] array) {
        int result = -1;
        for (int i : array) {
            if (checkPerfectNumber(i)) {
                result = i;
            }
        }
        
        return result;
    }
    
    
    public int getLastPrime (int[] array) {
        int result = -1;
        for (int i : array) {
            if (checkPrime(result)) {
                result = i;
            }
        }
        
        return result;
    }
    
    public int getMaxPrime (int[] array) {
        int maxPrime = 0;
        for (int i : array) {
            if (checkPrime(i) && i > maxPrime) {
                maxPrime = i;
            }
        }
        
        return maxPrime;
    }
    
    public int getMinPerfectNumberItem (int[] array) {
        int minPerfect = 0;
        for (int i : array) {
            if (checkPerfectNumber(i) && i < minPerfect) {
                minPerfect = i;
            }
        }
        
        return minPerfect;
    }
    
    public int getItemByDistanceWithNumber (int[] array, int number) {
        int maxDistance = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int distance = Math.abs(array[i] - number);
            if (distance > maxDistance) {
                maxDistance = distance;
                index = i;
            }
        }
        
        return array[index];
    }
    
    public int getIndexByDistanceWithNumber (int[] array, int number) {
        int maxDistance = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int distance = Math.abs(array[i] - number);
            if (distance > maxDistance) {
                maxDistance = distance;
                index = i;
            }
        }
        
        return index;
    }
    
    public int getMin (int[] array) {
        int result = array[0];
        for (int i : array) {
            if (i < result) result = i;
        }
        
        return result;
    }
    
    public int getAbsMax (int[] array) {
        int result = Math.abs(array[0]);
        for (int i : array) {
            if (result < Math.abs(i)) {
                result = Math.abs(i);
            }
        }
        
        return result;
    }
    
    public int getFirstItemGreaterThanLimitedNumber (int[] array, int limitedNumber) {
        int result = -1;
        for (int i : array) {
            if (i > limitedNumber) {
                result = i;
                return result;
            }
        }
        
        return result;
    }
    
    public int getFirstItemByRange (int[] array, int minRange, int maxRange) {
        int result = minRange;
        for (int i : array) {
            if (i > minRange && i < maxRange) {
                result = i;
                return result;
            }
        }
        
        return result;
    }
    
    public int getIndexByValueAround (int[] array) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (i != 0 && i != (array.length - 1 )) {
                int current = array[i];
                int previous = array[i - 1];
                int next = array[i + 1];
                
                if (current == (previous * next)) index = i;
            }
        }
        
        return index;
    }
    
    public boolean checkPerfectSquare (int number) {
        if (number > 0) {
            int temp = (int) Math.sqrt(number);
            return temp * temp == number;
        }
        
        return false;
    }
    
    public int getFirstPerfectSquareItem (int[] array) {
        int result = -1;
        for (int i : array) {
            if (checkPerfectSquare(i)) {
                result = i;
                return result;
            }
        }
        
        return result;
    }
    
    public boolean checkOddFirstDigit (int number) {
        int temp = number;
        while (temp / 10 != 0) {
            temp = temp/10;
        }
        return temp % 2 != 0;
    }
    
    public int getFirstItemHasFirstOddDigit (int[] array) {
        int result = -1;
        for (int i : array) {
            if (checkOddFirstDigit(i)) {
                result = i;
                return result;
            }
        }
        
        return result;
    }
    
    public boolean check2PowFormNumber (int number) {
        int temp = log2(number);
        return number == (int)Math.pow(2, temp);
    }
    
    public int log2 (int number) {
        return (int)(Math.log(number) / Math.log(2));
    }
    
    public int getFirstItemHas2PowForm (int[] array) {
        int result = -1;
        for (int i : array) {
            if (check2PowFormNumber(i)) {
                result = i;
                return result;
            }
        }
        
        return result;
    }
    
    public boolean checkOddAllDigitNumber (int number) {
        int temp = number;
        if (temp % 2 == 0) {
            return false;
        } else {
            while (temp % 10 != 0) {
                int c = temp % 10;
                if (c % 2 == 0) {
                    return false;
                }
                temp = temp / 10;
            }
            
            return true;
        }
    }
    
    public int getMaxItemHasOddAllDigit (int[] array) {
        int result = 0;
        for (int i : array) {
            if (checkOddAllDigitNumber(i) && Math.abs(i) > Math.abs(result)) {
                result = i;
            }
        }
        
        return result;
    }
    

    public int getMaxOddItemByMinEvenItem (int[] array) {
        int min = getMinEvenItem(array);
        int result = Integer.MIN_VALUE;
        for (int i : array) {
            if (i % 2 != 0) {
                if (min != Integer.MAX_VALUE) {
                    if (i < min && i > result) result = i;
                } else {
                    if (i > result) result = i;
                }
            }
        }
        
        return result;
    }
    
    public int getMinEvenItem (int[] array) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] < result) {
                result = array[i];
            }
        }
        
        return result;
    }
    
    public int getLeastAppearingDigit (int[] array) {
        Map<Integer, Integer> counter = countAppearingDigit(array);
        int least = Integer.MAX_VALUE;
        int result = -1;
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            if (entry.getValue() < least) {
                result = entry.getKey();
                least = entry.getValue();
            }
        }
        
        return result;
    }
    
    public Map<Integer, Integer> countAppearingDigit (int[] array) {
        Map<Integer, Integer> counter = new HashMap<>();
        
        for (int i : array) {
            int temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                if (counter.containsKey(digit)) {
                    int count = counter.get(digit);
                    counter.replace(digit, count + 1);
                } else {
                    counter.put(digit, 1);
                }
                temp = temp / 10;
            }
        }
        
        return counter;
    }
}

