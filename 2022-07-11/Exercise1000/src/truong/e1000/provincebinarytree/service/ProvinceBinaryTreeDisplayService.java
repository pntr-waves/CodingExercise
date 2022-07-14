package truong.e1000.provincebinarytree.service;

import truong.e1000.provincebinarytree.model.Node;
import truong.e1000.provincebinarytree.model.Province;

public class ProvinceBinaryTreeDisplayService {
    public void printAllProvinces (Node root) {
        if (root == null) return;
        
        printAllProvinces(root.left);
        printProvince(root.data);
        printAllProvinces(root.right);
    }
    
    public void printProvince (Province province) {
        System.out.println("---------------------------");
        System.out.println("Code: " + province.getProvinceCode());
        System.out.println("Province: " + province.getProvinceName());
        System.out.println("Population: " + province.getPopulation());
        System.out.println("Area: " + province.getArea());
    }
}
