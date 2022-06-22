package truong.e1000.agencymanagement.service;

import java.time.LocalDate;
import java.util.List;

import truong.e1000.agencymanagement.data.AgencyDataTestingBuilder;
import truong.e1000.agencymanagement.model.Agency;

public class AgencyManagementService {
    void sortByName (List<Agency> agencys, int low, int high) {
        if (low < high) {
            int mid = partitionByName(agencys, low, high);
            sortByName(agencys, low, mid - 1);
            sortByName(agencys, mid + 1, high);
        }
    }
    
    int partitionByName (List<Agency> agencys, int low, int high) {
        Agency pivot = agencys.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            String name = agencys.get(j).getAgencyName().toLowerCase();
            if (pivot.getAgencyName().toLowerCase().compareTo(name) > 1) {
                i++;
                Agency temp = agencys.get(j);
                agencys.set(j, agencys.get(i));
                agencys.set(i, temp);
            }
        }
        
        agencys.set(high, agencys.get(i + 1));
        agencys.set(i + 1, pivot);
        
        return i + 1;
    }
    
    Agency findByName (List<Agency> agencys, int left, int right, String name) {
        if (left < right) {
            int mid = (left + right) / 2;
            if (agencys.get(mid).getAgencyName().equalsIgnoreCase(name)) {
                return agencys.get(mid);
            } else  if (agencys.get(mid).getAgencyName().compareTo(name) < 1) {
                return findByName(agencys, mid + 1, right, name);
            } else {
                return findByName(agencys, left, mid - 1, name);
            }
        }
        
        return null;
    }
    
    public Agency findByName (String name) {
        List<Agency> agencys = AgencyDataTestingBuilder.getAgencyList();
        sortByName(agencys, 0, agencys.size() - 1);
        return findByName(agencys, 0, agencys.size() - 1, name);
    }
    
    public void sortByEstablishDate (List<Agency> agencys, int low, int high) {
        if (low < high) {
            int i = partitionByEstablishDate(agencys, low, high);
            sortByEstablishDate(agencys, low, i - 1);
            sortByEstablishDate(agencys, i + 1, high);
        }
    }
    
    int partitionByEstablishDate (List<Agency> agencys, int low, int high) {
        Agency pivot = agencys.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            LocalDate d = agencys.get(j).getEstablishDate();
            if (pivot.getEstablishDate().isBefore(d)) {
                i++;
                Agency temp = agencys.get(i);
                agencys.set(i, agencys.get(j));
                agencys.set(j, temp);
            }
        }
        
        agencys.set(high, agencys.get(i + 1));
        agencys.set(i + 1, pivot);
        
        return i + 1;
    }
    
    public Agency getNewlyAgency () {
        List<Agency> agencys = AgencyDataTestingBuilder.getAgencyList();
        sortByEstablishDate(agencys, 0, agencys.size() - 1);
        return agencys.get(0);
    }
}
