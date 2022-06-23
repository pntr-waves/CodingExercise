package truong.e1000.linkedlismanagement.model;

public class LinkedList {
    public Node head;
    
    public void push (Node node) {
        if (this.head == null) {
            this.head = node;
            return;
        }
        
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }
    
    public LinkedList concat (LinkedList linkedList) {
        LinkedList result = new LinkedList();
        if (this.head != null && linkedList.head == null) {
            result = this;
        } else if (this.head == null && linkedList.head != null) {
            result = linkedList;
        } else {
            if (result.head == null) {
                result.head = this.head;
            }
            
            Node temp = result.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            
            temp.next = linkedList.head;
        }
        
        return result;
    }
    
}
