package truong.e1000.provincebinarytree.service;

import truong.e1000.provincebinarytree.model.BinaryTree;
import truong.e1000.provincebinarytree.model.Node;
import truong.e1000.provincebinarytree.model.Province;

public class ProvinceBinaryTreeService {
    
    public Province getLargestPopulationProvince (Node root) {
        Node temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        
        return temp.data;
    }
    
    public BinaryTree getProvinceByArea (Node root, double area) {
        BinaryTree result = new BinaryTree();
        listProvinceByArea(root, area, result);
        return result;
    }
    
    private void listProvinceByArea (Node root, double area, BinaryTree result) {
        if (root == null) return;
        
        listProvinceByArea(root.left, area, result);
        if (root.data.getArea() > area) {
            result.add(root.data);
        }
        listProvinceByArea(root.right, area, result);
    }
    
    public BinaryTree getProvinceByAreaAndPopulation (Node root, double area, int population) {
        BinaryTree result = new BinaryTree();
        listProvinceByAreaAndPopulation(root, area, population, result);
        return result;
    }
    
    private void listProvinceByAreaAndPopulation (Node root, double area, int population, BinaryTree result) {
        if (root == null) return;
        
        if (root.data.getArea() < area && root.data.getPopulation() > population) {
            result.add(root.data);
        }
        
        listProvinceByAreaAndPopulation(root.left, area, population, result);
        listProvinceByAreaAndPopulation(root.right, area, population, result);
    }
    
    public int countProvinceByAreaAndPopulation (Node root, double area, int population) {
        if (root == null) return 0;
        
        int temp = 0;
        if (root.data.getArea() < area && root.data.getPopulation() > population) temp = 1;
        
        return temp + countProvinceByAreaAndPopulation(root.left, area, population) + countProvinceByAreaAndPopulation(root.right, area, population);
    }
}
