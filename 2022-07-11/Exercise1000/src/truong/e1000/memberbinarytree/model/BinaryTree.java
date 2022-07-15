package truong.e1000.memberbinarytree.model;

public class BinaryTree {
    public Node root;
    
    public void add (Member data) {
        if (root == null) root = new Node(data);
        
        Node parent = null, temp = root;
        while (temp != null) {
            parent = temp;
            if (temp.data.getRegistrationDate().isBefore(data.getRegistrationDate())) {
                temp = temp.right;
            } else {
                temp = temp.left;
            }
        }
        
        if (parent.data.getRegistrationDate().isBefore(data.getRegistrationDate())) {
            parent.right = new Node(data);
        } else {
            parent.left = new Node(data);
        }
        
    }
}
