/*
 * 835. Write a program with requirements: 
 * a. Create object Candidate. Know that: 
 * - Candidate code: String type
 * - Full name: String type
 * - Math mark: real number type
 * - Physics mark: real number type
 * - Chemistry mark: real number type
 * - Total mark: real number type
 * b. Show candidates can pass in a list.
 * A candidate can pass if he/she has total mark greater than 15 and every object has mark greater than 0
 * c. Sort the list by total mark with descending order
 */

package truong.e1000.candidatemanagement;

import truong.e1000.candidatemanagement.service.CandidateManagementDisplayService;
import truong.e1000.candidatemanagement.service.CandidateManagementService;

public class CandidateManagementApp {
    public static void main(String[] args) {
        CandidateManagementService service = new CandidateManagementService();
        CandidateManagementDisplayService display = new CandidateManagementDisplayService();
        System.out.println("1. List of pass exam candidate");
        System.out.println("===================================================");
        display.printCandidateList(service.getPassExamCandidateList());
        System.out.println("\n2. Sort candidate list by total mark with asending order");
        System.out.println("===================================================");
        display.printCandidateList(service.sortByTotalMark());
    }
}
