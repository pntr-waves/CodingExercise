package truong.e1000.savingmanagement.service;

import java.util.List;

import truong.e1000.savingmanagement.data.SavingDataTestingBuilder;
import truong.e1000.savingmanagement.model.Saving;

public class SavingManagementService {
    public double getTotalSavingModel () {
        List<Saving> savingList = SavingDataTestingBuilder.getSavingList();
        double total = 0;
        for (Saving s : savingList) {
            total += s.getSavingMoney();
        }
        
        return total;
    }
    
    void sortByIdCardNumber (List<Saving> savingList, int low, int high) {
        if (low < high) {
            int i = partitionByIdCardNumber(savingList, low, high);
            
            sortByIdCardNumber(savingList, low, i - 1);
            sortByIdCardNumber(savingList, i + 1, high);
        }
    }
    
    int partitionByIdCardNumber (List<Saving> savingList, int low, int high) {
        Saving pivot = savingList.get(high);
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (savingList.get(j).getIdCardNumber().compareTo(pivot.getIdCardNumber()) < 0) {
                i++;
                Saving temp = savingList.get(i);
                savingList.set(i, savingList.get(j));
                savingList.set(j, temp);
            }
        }
        
        Saving temp = savingList.get(i + 1);
        savingList.set(i + 1, pivot);
        savingList.set(high, temp);
        
        return i + 1;
    }
    
    public Saving findByIdCardNumber (String idCardNumber) {
        List<Saving> savingList = SavingDataTestingBuilder.getSavingList();
        sortByIdCardNumber(savingList, 0, savingList.size() - 1);
        return findByIdCardNumber(savingList, idCardNumber, 0, savingList.size() - 1);
    }
    
    Saving findByIdCardNumber (List<Saving> savingList, String idCardNumber, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (savingList.get(mid).getIdCardNumber().compareTo(idCardNumber) == 0) {
                return savingList.get(mid);
            }
            
            if (savingList.get(mid).getIdCardNumber().compareTo(idCardNumber) < 0) {
                return findByIdCardNumber(savingList, idCardNumber, mid + 1, right);
            }

            return findByIdCardNumber(savingList, idCardNumber, left, mid - 1);
            
        }
        
        return null;
    }
}
