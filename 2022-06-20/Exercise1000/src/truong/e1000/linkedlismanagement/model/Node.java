package truong.e1000.linkedlismanagement.model;

public class Node {
    private int data;
    public Node next;

    public Node (int data) {
        this.data = data;
    }
    
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
