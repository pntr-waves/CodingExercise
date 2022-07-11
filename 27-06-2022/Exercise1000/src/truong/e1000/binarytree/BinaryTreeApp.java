/**
 * 861. Implement structure of binary tree
 * 864. Implement a method to find a node has max data
 * 865. Implement a method to count a node has data greater than 1500
 * 866. Implement a method to calculate total data with data less than 2004
 * 867. Implement a method to check exist data in tree
 * 868. Find node in binary tree
 * 869. Delete node in binary tree
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
        
        System.out.println("Binary Tree: ");
        System.out.println("==============================================");
        display.print(tree);
//        System.out.print("\nMax Data In Tree: ");
//        System.out.println(service.getMaxData(tree));
//        System.out.println("==============================================");
//        System.out.print("\nCount Node has Data Greater Than 1500 In Tree: ");
//        System.out.println(service.countData(tree, 1500));
//        System.out.println("==============================================");
//        System.out.print("\nTotal Data Less Than 2004 In Tree: ");
//        System.out.println(service.getTotalData(tree, 2004));
//        System.out.println("==============================================");
//        int checkData = 2949;
//        System.out.print("\nData Equal " + checkData +" In Tree: ");
//        System.out.println(service.checkDataExist(tree, checkData) ? "Exist" : "Not Exist");
//        System.out.println("==============================================");
//        
        int findData = 2641;
        System.out.print("\nData Equal " + findData +" In Tree: ");
        Node findNode = service.findData(tree, findData);
        System.out.println(findNode.toString() + String.format(" [%d]", findNode.getData()));
        System.out.println("==============================================");
    }
}
