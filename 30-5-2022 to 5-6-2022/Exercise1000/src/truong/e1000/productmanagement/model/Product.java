/*831. Write a program to the following: 
 * a. Create Product object with: 
 * - Product name: String type
 * - Unit price: real number type
 * - Quantity: integer type
 * b. Find a Product has the highest quantity price
 * c. Count Product has quantity greater than 1000 in list
 */

package truong.e1000.productmanagement.model;

public class Product {
    private String productName;
    private double unitPrice;
    private int quantity;

    public Product(String productName, double unitPrice, int quantity) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.setQuantity(quantity);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
