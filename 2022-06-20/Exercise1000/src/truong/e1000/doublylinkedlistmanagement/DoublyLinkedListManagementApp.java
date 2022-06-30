/**
 * 844. Implement Doubly Linked List
 * 847. Implement generate Doubly Linked List method
 * 845. Implement Doubly Linked List of Fraction
 * 846. Implement Doubly Linked List of Complex
 * 849. Implement generate node method for Doubly Linked List 
 * 850. Implement display all node of Doubly Linked List method
 * 851. Implement display all node of Fraction Doubly Linked List method
 */
package truong.e1000.doublylinkedlistmanagement;

import truong.e1000.doublylinkedlistmanagement.data.service.model.DLLDataTestingBuilder;
import truong.e1000.doublylinkedlistmanagement.model.DoublyLinkedList;
import truong.e1000.doublylinkedlistmanagement.service.model.DLLDisplayService;

public class DoublyLinkedListManagementApp {
    public static void main(String[] args) {
        DLLDisplayService display = new DLLDisplayService();
        
        System.out.println("Generate Doubly Linked List");
        System.out.println("===================================");
        DoublyLinkedList dll = DLLDataTestingBuilder.generateRandomLinkedList();
        display.printDLL(dll);
        
        System.out.println("Generate Fraction Doubly Linked List");
        System.out.println("===================================");
        DoublyLinkedList fractionDll = DLLDataTestingBuilder.generateRandomFractionDLL();
        display.printDLL(fractionDll);
        
        System.out.println("Generate Complex Doubly Linked List");
        System.out.println("===================================");
        DoublyLinkedList complexDll = DLLDataTestingBuilder.generateRandomComplexDLL();
        display.printDLL(complexDll);
    }
}
