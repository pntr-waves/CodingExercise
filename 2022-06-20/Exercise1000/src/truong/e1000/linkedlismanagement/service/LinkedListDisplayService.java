package truong.e1000.linkedlismanagement.service;

import truong.e1000.linkedlismanagement.model.LinkedList;
import truong.e1000.linkedlismanagement.model.Node;

public class LinkedListDisplayService {
    public void printLinkedList (LinkedList linkedList) {
        if (linkedList.head != null) {
            Node i = linkedList.head;
            while (i != null) {
                printNode(i);
                i = i.next;
            }
        } else {
            System.out.println("Linked List is null");
        }
    }
    
    public void printNode (Node node) {
        if (node != null) {
            System.out.print(String.format("[%d] ", node.getData()));
        }
    }
}
