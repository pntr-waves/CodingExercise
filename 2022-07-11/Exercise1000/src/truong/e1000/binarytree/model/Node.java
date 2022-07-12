package truong.e1000.binarytree.model;

public class Node {
    public Node left;
    public Node right;
    private int data;
    
    public Node (int data) {
        this.setData(data);
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
