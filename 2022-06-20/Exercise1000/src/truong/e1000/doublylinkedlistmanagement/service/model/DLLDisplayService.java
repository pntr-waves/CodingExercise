package truong.e1000.doublylinkedlistmanagement.service.model;

import truong.e1000.doublylinkedlistmanagement.model.DoublyLinkedList;
import truong.e1000.doublylinkedlistmanagement.model.Node;

public class DLLDisplayService {
    public void printDLL (DoublyLinkedList dll) {
        if (dll.head != null) {
            Node index = dll.head;
            while (index.next != null) {
                System.out.print(String.format("[%s]", index.getData()));
                index = index.next;
            }
        }
        System.out.println("\n");
    }
}
