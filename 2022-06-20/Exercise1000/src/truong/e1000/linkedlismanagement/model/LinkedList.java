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
            result = cloneNewLinkedList(this);
        } else if (this.head == null && linkedList.head != null) {
            result = cloneNewLinkedList(linkedList);
        } else {
            result = cloneNewLinkedList(this);
            
            Node lastNode = result.head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            
            Node temp = linkedList.head;
            while (temp != null) {
                lastNode.next = temp;
                lastNode = lastNode.next;
                temp = temp.next;
            }
        }
        
        return result;
    }
    
    LinkedList cloneNewLinkedList (LinkedList linkedList) {
        LinkedList result = new LinkedList();
        Node temp = linkedList.head;
        while (temp != null) {
            Node newNode = new Node(temp.getData());
            result.push(newNode);
            temp = temp.next;
        }
        
        return result;
    }
    
    public void mergeSort () {
        this.head = mergeSort(this.head);
    }
    
    Node merge (Node left, Node right) {
        if (left == null) return right;
        if (right == null) return left;
        Node result = null;
        
        if (left.getData() < right.getData()) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }
        
        return result;
    }
    
    Node mergeSort (Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        Node mid = getMidNode(head);
        Node midNext = mid.next;
        mid.next = null;
        
        Node left = mergeSort(head);
        Node right = mergeSort(midNext);
        
        Node sorted = merge(left, right);
        
        return sorted;
    }
    
    Node getMidNode (Node head) {
        if (head == null) {
            return head;
        }
        
        Node slow = head; Node fast = head;
        while (slow.next != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public int size () {
        int size = 0;
        Node i = this.head;
        while (i != null) {
            size++;
            i = i.next;
        }
        
        return size;
    }
    
    public Node get (int index) {
        int size = size();
        Node temp = null;
        if (index < size) {
            int i = 0;
            temp = this.head;
            while (i < index) {
                i++;
                temp = temp.next;
            }
        }
        
        return temp;
    }
    
    public void set (int index, Node node) {
        int size = size();
        if (index < size) {
            Node target = get(index);
            target.setData(node.getData());
        }
    }
    
    public void quickSort () {
        quickSort(this.head, this.get(this.size() - 1));
    }
    
    void quickSort (Node start, Node end) {
        if (start == null || start == end || start == end.next) {
            return;
        }
        
        Node prevPivot = partion(start, end);
        quickSort(start, prevPivot);
        
        if (prevPivot != null && prevPivot == start) {
            quickSort(prevPivot.next, end);
        }
        
        if (prevPivot != null && prevPivot.next != null) {
            quickSort(prevPivot.next.next, end);
        }
    }

    private Node partion(Node start, Node end) {
        if (start == end || start == null || end == null) {
            return start;
        }
        
        Node prevPivot = start;
        Node curr = start;
        int pivot = end.getData();
        
        while (start != end) {
            if (start.getData() < pivot) {
                prevPivot = curr;
                int temp = curr.getData();
                curr.setData(start.getData());
                start.setData(temp);
                curr = curr.next;
            }
            
            start = start.next;
        }
        
        int temp = curr.getData();
        curr.setData(pivot);
        end.setData(temp);
        
        return prevPivot;
    }
}
