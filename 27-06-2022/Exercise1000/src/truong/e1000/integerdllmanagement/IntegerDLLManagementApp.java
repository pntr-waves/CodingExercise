/**
 * 853. Write the program with following:
 * - Implement Integer Doubly Linked List
 * - Display Integer Doubly Linked List
 * - Find a total value of all node
 * 861. Implement structure of binary tree	
 */
package truong.e1000.integerdllmanagement;

import truong.e1000.integerdllmanagement.data.DataIntegerDLLTestingBuilder;
import truong.e1000.integerdllmanagement.model.DLL;
import truong.e1000.integerdllmanagement.service.IntegerDLLDisplayService;
import truong.e1000.integerdllmanagement.service.IntegerDLLService;

public class IntegerDLLManagementApp {
    public static void main(String[] args) {
        IntegerDLLDisplayService display = new IntegerDLLDisplayService();
        IntegerDLLService service = new IntegerDLLService();

        System.out.println("Node in Integer Doubly Linked List:");
        System.out.println("=======================================");
        DLL dll = DataIntegerDLLTestingBuilder.generateRandomIntegerDLL();
        display.printDLL(dll);
        System.out.println("\nTotal value in list:");
        System.out.println("=======================================");
        System.out.println(service.getTotalValue(dll));
    }
}
