/**
 * 838. Write the program with requirements: 
 * a. Declare Saving object with a below descriptions: 
 * - Code: sequence character type
 * - Saving type: sequence character type
 * - Customer's full name: sequence character type
 * - Identify card number: sequence character type
 * - Created day: datetime type
 * - Saving money: real number type
 * b. Find total saving money in a list
 * c. Find Saving by Identify card number
 */
package truong.e1000.savingmanagement;

import java.util.Scanner;

import truong.e1000.savingmanagement.service.SavingManagementDisplayService;
import truong.e1000.savingmanagement.service.SavingManagementService;

public class SavingManagementApp {
    public static void main(String[] args) {
        SavingManagementService service = new SavingManagementService();
        SavingManagementDisplayService display = new SavingManagementDisplayService();
        
        System.out.println("1. Total saving money in a list: " + service.getTotalSavingModel());
        System.out.println("============================================");
        System.out.println("\n2. Find the Saving: ");
        System.out.println("=============================================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Id Card Number: ");
        String id = sc.next();
        System.out.println("Find the Saving with Id Card Number: " + id);
        display.printSaving(service.findByIdCardNumber(id));
    }
}


