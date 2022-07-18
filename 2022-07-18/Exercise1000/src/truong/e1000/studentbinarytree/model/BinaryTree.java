package truong.e1000.studentbinarytree.model;

public class BinaryTree {
    public Node root;
    
    public void add (Student data) {
        if (root == null) {
            root = new Node (data);
            return;
        }
        
        Node parent = null, temp = root;
        while (temp != null) {
            parent = temp;
            if (temp.data.getFullName().compareToIgnoreCase(data.getFullName()) > 0) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        
        if (parent.data.getFullName().compareToIgnoreCase(data.getFullName()) > 0) {
            parent.left = new Node(data);
        } else {
            parent.right = new Node(data);
        }
    }
}
