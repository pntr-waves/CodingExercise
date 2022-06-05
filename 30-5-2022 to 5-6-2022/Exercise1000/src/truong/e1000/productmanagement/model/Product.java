//831. Viết chương trình thực hiện các yêu cầu sau:
//a. Khai báo cấu trúc dữ liệu của một danh sách liên kết đơn các mặt
//hàng (MATHANG). Biết rằng một mặt hàng gồm những thành
//phần như sau:
//- Tên mặt hàng: chuỗi tối đa 20 ký tự.
//- �?ơn giá: kiểu số nguyên 4 byte.
//- Số lượng tồn: kiểu số nguyên 4 byte.
//b. Nhập danh sách.
//c. Xuất danh sách.
//d. Tìm mặt hàng có tổng giá trị tồn là lớn nhất.
//e. �?ếm số lượng mặt hàng có số lượng tồn lớn hơn 1.000

package truong.e1000.productmanagement.model;

public class Product {
	private String productName;
	private double unitPrice;
	private int amount;
	
	public Product (String productName, double unitPrice, int amount) {
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.amount = amount;
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
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
