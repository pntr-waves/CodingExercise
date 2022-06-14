/*831. Write a program to the following: 
 * a. Create Product object with: 
 * - Product name: String type
 * - Unit price: real number type
 * - Quantity: integer type
 * b. Find a Product has the highest quantity price
 * c. Count Product has quantity greater than 1000 in list
 */
package truong.e1000.productmanagement;

import truong.e1000.productmanagement.service.ProductManagementService;

public class ProductManagementApp {
    public static void main(String[] args) {
        ProductManagementService service = new ProductManagementService();
        System.out.println("1. List of Product has the biggest amount");
        System.out.println("===================================================");
        service.printProductList(service.getBiggestQuantityProductList());

        System.out.println("\n2. The number of product has quantity greater than 1000");
        System.out.println("===================================================");
    }
}
