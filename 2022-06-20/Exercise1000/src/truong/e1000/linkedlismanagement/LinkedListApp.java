/**
 * 841. Link 2 LinkedList
 * 842. Merge Sort with LinkedList
 * 843. Quick Sort with LinkedList
 * 
 */
package truong.e1000.linkedlismanagement;

import truong.e1000.linkedlismanagement.data.LinkedListDataTestingBuilder;
import truong.e1000.linkedlismanagement.model.LinkedList;
import truong.e1000.linkedlismanagement.model.Node;
import truong.e1000.linkedlismanagement.service.LinkedListDisplayService;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedListDisplayService display = new LinkedListDisplayService();
        
        System.out.println("Link 2 linked list");
        System.out.println("=============================================");
        LinkedList linkedList1 = LinkedListDataTestingBuilder.generateRandomLinkedList();
        LinkedList linkedList2 = LinkedListDataTestingBuilder.generateRandomLinkedList();
        LinkedList result = linkedList1.concat(linkedList2);
        System.out.println("Linked List 1: ");
        display.printLinkedList(linkedList1);
        System.out.println("\nLinked List 2: ");
        display.printLinkedList(linkedList2);
        System.out.println("\nConcat Linked List: ");
        display.printLinkedList(result);
        
        System.out.println("\n\nMerge sort with linked list");
        System.out.println("=============================================");
        LinkedList mlist = LinkedListDataTestingBuilder.generateRandomLinkedList();
        mlist.mergeSort();
        display.printLinkedList(mlist);
        
        System.out.println("\n\nQuick sort with linked list");
        System.out.println("=============================================");
        LinkedList qlist = LinkedListDataTestingBuilder.generateRandomLinkedList();
        qlist.quickSort();
        display.printLinkedList(qlist);
    }
}
