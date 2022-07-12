package truong.e1000.binarytree.service;

import truong.e1000.binarytree.model.BinaryTree;
import truong.e1000.binarytree.model.Node;

public class BinaryTreeDisplayService {
    public void print (BinaryTree tree) {
        printAllNode(tree.root);
    }
    
    public void printAllNode (Node root) {
        if (root != null) {
            printAllNode(root.left);
            System.out.println(String.format("[%d] ", root.getData()));
            printAllNode(root.right);
        }
    }
}
