package truong.e1000.provincebinarytree.model;

public class BinaryTree {
    public Node root;
    
    public void add (Province data) {
        if (root == null) {
            root = new Node(data);
            return;
        }
        
        Node parent = null, temp = root;
        while (temp != null) {
            parent = temp;
            if (temp.data.getPopulation() < data.getPopulation()) {
                temp = temp.right;
            } else {
                temp = temp.left;
            }
        }
        
        if (parent.data.getPopulation() < data.getPopulation()) {
            parent.right = new Node(data);
        }
        else {
            parent.left = new Node (data);
        }
    }
}
