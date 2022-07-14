package truong.e1000.binarytree.service;

import truong.e1000.binarytree.model.BinaryTree;
import truong.e1000.binarytree.model.Node;

public class BinaryTreeDisplayService {
    public void print (Node root) {
        if (root != null) {
            print(root.left);
            System.out.println("[" + root.getData() + "]");
            print(root.right);
        }
    }
    
    public void printEvenNode (BinaryTree tree) {
        printEvenNode(tree.root);
    }
    
    public void printEvenNode (Node root) {
        if (root != null) {
            printEvenNode(root.left);
            if (root.getData() % 2 == 0) {
                System.out.println("[" + root.getData() + "]");
            }
            printEvenNode(root.right);
        }
    }
    
    public void printInXY (Node root, int x, int y) {
        if (root != null) {
            printInXY(root.left, x, y);
            if (root.getData() > x && root.getData() < y) {
                System.out.println("[" + root.getData() + "]");
            }
            printInXY(root.right, x, y);
        }
    }
    
    private boolean checkPerfectNumber (int number) {
        int i = 1;
        int sum = 0;
        while (i <= number / 2) {
            if (number % i == 0) {
                sum += i;
            }
            
            i++;
        }
        
        if (sum == number) return true;
        return false;
    }
    
    public void printPerfectNumberNode (Node root) {
        if (root != null) {
            printPerfectNumberNode(root.left);
            if (checkPerfectNumber(root.getData())) {
                System.out.println("[" + root.getData() + "]");
            }
            printPerfectNumberNode(root.right);
        }
    }
    
    public void printNodeWithLevel (Node root, int level, int temp) {
        if (root != null) {
            printNodeWithLevel(root.left, level, temp + 1);
            printNodeWithLevel(root.right, level, temp +  1);
            
            if (level == temp) {
                System.out.println("[" + root.getData() + "]");
            }
        }
    }
     
    public void printAllNodeWithLevel (BinaryTree tree) {
        int height = tree.height;
        int index = 0;
        while (index < height) {
            System.out.println("Print Node In Level " + index);
            System.out.println("---------------------------------");
            printNodeWithLevel(tree.root, index, 0);
            index++;
        }
    }
}
