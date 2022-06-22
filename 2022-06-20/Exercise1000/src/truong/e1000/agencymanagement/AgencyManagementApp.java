/**
 * 839. Write the program with the following:
 * a. Declare Class represent for Agency with properties: 
 * - Agency code: sequence character type
 * - Agency name: sequence character type
 * - Phone number: sequence character type
 * - Establish date: datetime type
 * - Address: sequence character type
 * - E-mail: sequence character type
 * b. Find a agency by agency name
 * c. Find a newly agency
 */
package truong.e1000.agencymanagement;

import java.util.Scanner;

import truong.e1000.agencymanagement.service.AgencyManagementDisplayService;
import truong.e1000.agencymanagement.service.AgencyManagementService;

public class AgencyManagementApp {
    public static void main(String[] args) {
        AgencyManagementService service = new AgencyManagementService();
        AgencyManagementDisplayService display = new AgencyManagementDisplayService();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Find agency");
        System.out.println("====================================");
        System.out.print("Enter agency's name: ");
        String name = sc.nextLine();
        
        display.printAgency(service.findByName(name));
        System.out.println("2. Find a newly agency");
        System.out.println("====================================");
        display.printAgency(service.getNewlyAgency());
    }
}
