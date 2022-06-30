package truong.e1000.doublylinkedlistmanagement.model;

public class DoublyLinkedList {
    public Node head;
    
    public void push (Node node) {
        if (this.head == null) {
            this.head = node;
            return;
        }
        
        Node index = this.head;
        while (index.next != null) {
            index = index.next;
        }
        
        index.next = node;
        node.prev = index;
    }
}
