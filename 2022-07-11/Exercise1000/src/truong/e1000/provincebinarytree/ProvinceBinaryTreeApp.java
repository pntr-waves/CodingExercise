/**
 * 922. Manage list of province by Binary Tree, with follow below:
 * 1. Create Province class with information: 
 * - Province Code
 * - Province Name
 * - Population
 * - Area
 * 2. Find Province has the largest population
 * 3. List Provinces has a area larger than 800
 * 4. How many Province has area is smaller than 300 and population is larger than 1500
 */

package truong.e1000.provincebinarytree;

import truong.e1000.provincebinarytree.model.BinaryTree;
import truong.e1000.provincebinarytree.model.Province;
import truong.e1000.provincebinarytree.data.ProvinceBinaryTreeDataTestingBuilder;
import truong.e1000.provincebinarytree.service.ProvinceBinaryTreeDisplayService;
import truong.e1000.provincebinarytree.service.ProvinceBinaryTreeService;

public class ProvinceBinaryTreeApp {
    public static void main(String[] args) {
        ProvinceBinaryTreeDisplayService display = new ProvinceBinaryTreeDisplayService();
        ProvinceBinaryTreeService service = new ProvinceBinaryTreeService();
        BinaryTree provinceTree = ProvinceBinaryTreeDataTestingBuilder.getProvinceBinaryTree();
        
        System.out.println("List Province:");
        display.printAllProvinces(provinceTree.root);
        
        Province p = service.getLargestPopulationProvince(provinceTree.root);
        System.out.println("\nThe largest population province: " + p.getProvinceName() + "-" + p.getPopulation());
        
        double compareArea = 800;
        System.out.println("\nProvinces has a area is larger than " + compareArea);
        BinaryTree r = service.getProvinceByArea(provinceTree.root, compareArea);
        display.printAllProvinces(r.root);
        
        compareArea = 300;
        int comparePopulation = 1500;
        int count = service.countProvinceByAreaAndPopulation(provinceTree.root, compareArea, comparePopulation);
        System.out.println("\nHas " + count +" Provinces has a area is smaller than " + compareArea + " and a population is larger than " + comparePopulation);
        BinaryTree rs = service.getProvinceByAreaAndPopulation(provinceTree.root, compareArea, comparePopulation);
        display.printAllProvinces(rs.root);
        
        
    }
}
