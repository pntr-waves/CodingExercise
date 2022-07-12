/**
 * 870. Print Binary Tree
 * 871. Print All Even Node 
 * 872. Print All Node With Data in between x and y
 * 874. Print Node In Same Level
 * 875. Print Node From Level 0 to Level = Height - 1
 */

package truong.e1000.binarytree;

import truong.e1000.binarytree.data.BinaryTreeDataTestingBuilder;
import truong.e1000.binarytree.model.BinaryTree;
import truong.e1000.binarytree.service.BinaryTreeDisplayService;

public class BinaryTreeApp {
    public static void main(String[] args) {
        BinaryTreeDisplayService display = new BinaryTreeDisplayService();
        BinaryTree tree = BinaryTreeDataTestingBuilder.getBinaryTree();
        
        System.out.println("Binary Tree:");
        System.out.println("All Node: ");
        System.out.println("===============================");
        display.print(tree.root);
        
        System.out.println("All Even Node: ");
        System.out.println("===============================");
        display.printEvenNode(tree.root);
        
        int x = 80; int y = 150;
        System.out.println("All Even Node In " + String.format("[%d, %d]", x, y));
        System.out.println("===============================");
        display.printInXY(tree.root, x, y); 
        
        System.out.println("All perfect number node");
        System.out.println("===============================");
        display.printPerfectNumberNode(tree.root); 
        
        int level = 3;
        System.out.println("All Node in " + level);
        System.out.println("===============================");
        display.printNodeWithLevel(tree.root, level, 0); 
        
      System.out.println("All Node With Level: ");
      System.out.println("===============================");
      display.printAllNodeWithLevel(tree); 
    }
}
