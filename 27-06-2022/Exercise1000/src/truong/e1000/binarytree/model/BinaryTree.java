package truong.e1000.binarytree.model;

public class BinaryTree {
    public Node root;

    public void add(int data) {
        if (root == null) {
            this.root = new Node(data);
            return;
        }
        
        Node parent = null, temp;
        temp = root;
        while (temp != null) {
            parent = temp;
            if (temp.getData() > data) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        
        if (parent.getData() > data) {
            parent.left = new Node(data);
        } else {
            parent.right = new Node(data);
        }
    }
}
