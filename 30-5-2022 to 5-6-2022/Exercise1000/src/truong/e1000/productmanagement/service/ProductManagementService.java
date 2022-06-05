//831. Viết chương trình thực hiện các yêu cầu sau:
//a. Khai báo cấu trúc dữ liệu của một danh sách liên kết đơn các mặt
//hàng (MATHANG). Biết rằng một mặt hàng gồm những thành
//phần như sau:
//- Tên mặt hàng: chuỗi tối đa 20 ký tự.
//- Đơn giá: kiểu số nguyên 4 byte.
//- Số lượng tồn: kiểu số nguyên 4 byte.
//b. Nhập danh sách.
//c. Xuất danh sách.
//d. Tìm mặt hàng có tổng giá trị tồn là lớn nhất.
//e. Đếm số lượng mặt hàng có số lượng tồn lớn hơn 1.000

package truong.e1000.productmanagement.service;

import java.util.List;

import truong.e1000.productmanagement.model.Product;

public class ProductManagementService {
	void sortByAmout (List<Product> productList, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			
			sortByAmout(productList, left, mid);
			sortByAmout(productList, mid + 1, right);
			
			mergeByAmout(productList, left, mid, right);
		}
	}

	private void mergeByAmout(List<Product> productList, int left, int mid, int right) {
		
	}
}
