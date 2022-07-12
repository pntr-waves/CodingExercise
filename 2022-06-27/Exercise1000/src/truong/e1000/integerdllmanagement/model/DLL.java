package truong.e1000.integerdllmanagement.model;

public class DLL {
    public Node head;

    public void push(Node node) {
        if (head == null) {
            head = node;
            return;
        }

        Node index = head;
        while (index.next != null) {
            index = index.next;
        }

        index.next = node;
        node.prev = index;
    }
}
