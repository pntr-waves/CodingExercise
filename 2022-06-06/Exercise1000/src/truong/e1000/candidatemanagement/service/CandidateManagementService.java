package truong.e1000.candidatemanagement.service;

import java.util.ArrayList;
import java.util.List;

import truong.e1000.candidatemanagement.data.CandidateDataTestingBuilder;
import truong.e1000.candidatemanagement.model.Candidate;

public class CandidateManagementService {
    boolean checkPassExam (Candidate candidate) {
        if (candidate.getChemistryMark() > 0 && candidate.getMathMark() > 0 && candidate.getPhysicMark() > 0 && candidate.getTotalMark()> 15) {
            return true;
        }
        
        return false;
    }
    
    public List<Candidate> getPassExamCandidateList () {
        List<Candidate> candidateList = CandidateDataTestingBuilder.getCandidateList();
        List<Candidate> result = new ArrayList<>();
       
        for (Candidate candidate : candidateList) {
            if (checkPassExam(candidate)) {
                result.add(candidate);
            }
        }
        
        return result;
    }
    
    public List<Candidate> sortByTotalMark () {
        List<Candidate> candidateList = CandidateDataTestingBuilder.getCandidateList();
        return sortByTotalMark(candidateList, 0, candidateList.size() - 1);
    }
    
    List<Candidate> sortByTotalMark (List<Candidate> candidateList, int low, int high) {
        if (low < high) {
            int pi = partition(candidateList, low, high);
            
            sortByTotalMark(candidateList, low, pi - 1);
            sortByTotalMark(candidateList, pi + 1, high);
        }
        
        return candidateList;
    }
    
    int partition (List<Candidate> candidateList, int low, int high) {
        Candidate pivot = candidateList.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (candidateList.get(j).getTotalMark() > pivot.getTotalMark()) {
                i++;
                Candidate temp = candidateList.get(j);
                candidateList.set(j, candidateList.get(i));
                candidateList.set(i, temp);
            }
        }
        candidateList.set(high, candidateList.get(i + 1));
        candidateList.set(i + 1, pivot);
        
        return i + 1;
    }
    
}
