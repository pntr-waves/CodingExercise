package truong.e1000.candidatemanagement.service;

import java.util.List;

import truong.e1000.candidatemanagement.model.Candidate;

public class CandidateManagementDisplayService {
    public void printCandidateList (List<Candidate> candidateList) {
        System.out.println("List of Candidate");
        for (Candidate candidate : candidateList) {
            System.out.println("---------------------------------------------------");
            System.out.println("Candidate Code: " + candidate.getCode());
            System.out.println("Full Name: " + candidate.getFullName());
            System.out.println("Math: " + candidate.getMathMark());
            System.out.println("Physic: " + candidate.getPhysicMark());
            System.out.println("Chemistry: " + candidate.getChemistryMark());
            System.out.println("Total: " + candidate.getTotalMark());
        }
    }
}
