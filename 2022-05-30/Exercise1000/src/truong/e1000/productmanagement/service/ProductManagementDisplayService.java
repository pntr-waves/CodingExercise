package truong.e1000.productmanagement.service;

import java.util.List;

import truong.e1000.productmanagement.model.Product;

public class ProductManagementDisplayService {
    public void printProductList(List<Product> productList) {
        System.out.println("List of Product");

        for (Product product : productList) {
            System.out.println("---------------------------------------------------");
            System.out.println("Product Name: " + product.getProductName());
            System.out.println("Unit Price: " + product.getUnitPrice());
            System.out.println("Quantity: " + product.getQuantity());
        }
    }

}
