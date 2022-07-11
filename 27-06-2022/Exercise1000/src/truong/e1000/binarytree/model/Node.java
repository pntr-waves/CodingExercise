package truong.e1000.binarytree.model;

public class Node {
    private int data;
    public Node left;
    public Node right;

    public Node(int data) {
        this.setData(data);
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
