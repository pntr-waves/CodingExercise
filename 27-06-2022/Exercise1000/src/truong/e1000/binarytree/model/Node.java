package truong.e1000.binarytree.model;

public class Node<T> {
    private T data;
    public Node<T> left;
    public Node<T> right;

    public Node(T data) {
        this.setData(data);
    }

    public <T> T getData() {
        return (T) data;
    }

    public <T> void setData(T data) {
        this.data = (T) data;
    }

}
