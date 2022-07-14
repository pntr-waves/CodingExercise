/**
 * 870. Print Binary Tree
 * 871. Print All Even Node 
 * 872. Print All Node With Data in between x and y
 * 874. Print Node In Same Level
 * 875. Print Node From Level 0 to Level = Height - 1
 * 876. Count node has exactly one child
 * 877. Count node has two child
 * 878. Count even data Node
 * 879. Count leaf node has even data
 * 880. Count one child node has data is prime
 * 881. Count two child node has data is perfect square
 * 882. Count Node in same level
 * 883. Count Node in between level 0 to level x
 * 884. Count Node in between level x to level = height - 1
 * 885. Get total data
 * 886. Get total data of leaf node
 * 887. Get total data of one child node
 * 888. Get total data of two child node
 * 889. Get total data of odd node
 * 890. Get total data of even leaf node
 * 891. Get total data of one child prime node
 * 892. Get total data of two child perfect square node
 * 897. Find Max value
 * 898. Find Min value
 * 900. Find Node has max value
 */

package truong.e1000.binarytree;

import truong.e1000.binarytree.data.BinaryTreeDataTestingBuilder;
import truong.e1000.binarytree.model.BinaryTree;
import truong.e1000.binarytree.model.Node;
import truong.e1000.binarytree.service.BinaryTreeDisplayService;
import truong.e1000.binarytree.service.BinaryTreeService;

public class BinaryTreeApp {
    public static void main(String[] args) {
        BinaryTreeDisplayService display = new BinaryTreeDisplayService();
        BinaryTreeService service = new BinaryTreeService();
        BinaryTree tree = BinaryTreeDataTestingBuilder.getBinaryTree();
        
        System.out.println("Binary Tree:");
        System.out.println("All Node: ");
        System.out.println("===============================");
        display.print(tree.root);
        
        System.out.println("All Even Node: ");
        System.out.println("===============================");
        display.printEvenNode(tree.root);
        
        int x = 80; int y = 150;
        System.out.println("All Even Node In [" + x + "," +  y + "]");
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
        
        
        System.out.println("Number Node has exactly one child: " + service.countOneChildNode(tree.root));
        System.out.println("=====================================");
        
        System.out.println("Number Node has exactly one child: " + service.countTwoChildNode(tree.root));
        System.out.println("=====================================");
        
        System.out.println("Number Node has even data: " + service.countEvenNode(tree.root));
        System.out.println("=====================================");
        
        System.out.println("Number Leaf Node has even data: " + service.countEvenLeafNode(tree.root));
        System.out.println("=====================================");

        System.out.println("Number One Child Node has prime data: " + service.countOneChildPrimeNode(tree.root));
        System.out.println("=====================================");   

        System.out.println("Number Two Child Node has perfect square data: " + service.countTwoChildPerfectSquareNode(tree.root));
        System.out.println("====================================="); 
        
        int klevel = 3;
        System.out.println("Number Node in level " + klevel + ": " + (klevel == tree.height ? service.countNodeWithLevel(tree.root, klevel) : 0));
        System.out.println("====================================="); 
        
        int llevel = 5;
        System.out.println("Number Node in Lower than level " + llevel + ": " + (llevel < tree.height ? service.countNodeLowerThanLevel(tree.root, llevel) : 0));
        System.out.println("====================================="); 
        
        int hlevel = 4;
        System.out.println("Number Node in Higher than level " + hlevel + ": " + (hlevel < tree.height ? service.countNodeHigherThanLevel(tree.root, hlevel) : 0));
        System.out.println("====================================="); 
        
        System.out.println("Total Data: " + service.getTotalData(tree.root));
        System.out.println("====================================="); 

        System.out.println("Total Leaf Node Data: " + service.getTotalLeafNodeData(tree.root));
        System.out.println("=====================================");        
        
        System.out.println("Total One Child Data: " + service.getTotalOneChildNodeData(tree.root));
        System.out.println("=====================================");
        
        System.out.println("Total Two Child Node Data: " + service.getTotalTwoChildNodeData(tree.root));
        System.out.println("=====================================");
        
        System.out.println("Total Odd Data: " + service.getTotalOddData(tree.root));
        System.out.println("=====================================");
        
        System.out.println("Total Even Data Of Leaf: " + service.getTotalEvenDataOfLeaf(tree.root));
        System.out.println("=====================================");
        
        System.out.println("Total Prime Data Of One Child Node: " + service.getTotalPrimeDataOfOneChildNode(tree.root));
        System.out.println("=====================================");
        
        System.out.println("Total Perfect Square Data Of Two Child Node: " + service.getTotalPerfectSquareDataOfTwoChildNode(tree.root));
        System.out.println("=====================================");
     
        System.out.println("Max Value: " + service.findMaxValue(tree.root));
        System.out.println("=====================================");

        System.out.println("Min Value: " + service.findMinValue(tree.root));
        System.out.println("=====================================");

        System.out.println("Node has max value: [" + service.getMaxValueNode(tree.root).getData() + "]");
        System.out.println("=====================================");

        int findValue = 40;
        System.out.println("Find Node with value = " + findValue);
        Node findNode = service.getNodeByValue(tree.root, findValue);
        System.out.println("Node: " + findNode + " [" + findNode.getData() + "]");
    }
}
