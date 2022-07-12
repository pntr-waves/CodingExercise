package truong.e1000.binarytree.model;

public class BinaryTree {
    public Node root;
    public int height = 0;
    
    public void add (int data) {
        if (root == null) {
            root = new Node(data);
            return;
        }
        
        Node temp = root, parent = null;
        while (temp != null) {
            parent = temp;
            if (temp.getData() < data) {
                temp = temp.right;
            } else {
                temp = temp.left;
            }
        }
        
        if (parent.getData() < data) {
            parent.right = new Node(data);
        } else {
            parent.left = new Node(data);
        }

        this.height = updateHeight(root);
    }
    
    private int updateHeight(Node root) {
        if (root != null) {
            int leftHeight = updateHeight(root.left);
            int rightHeight = updateHeight(root.right);
            
            return leftHeight < rightHeight ? rightHeight + 1 : leftHeight + 1;
        }
        
        return 0;
    }
    
}
