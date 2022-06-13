/*
 * 837.Viết chương trình thực hiện các yêu cầu sau:
a. Khai báo cấu trúc dữ liệu của một danh sách liên kết đơn các lớp
học (LOPHOC). Biết rằng một lớp học gồm những thành phần như
sau:
- Tên lớp: chuỗi tối đa 30 ký tự.
- Sĩ số: kiểu số nguyên 2 byte.
- Danh sách các học sinh trong lớp (tối đa 50 học sinh)
b. Nhập danh sách.
c. Xuất danh sách.
d. Tìm một lớp có sỉ số đông nhất.
e. TÌm một học sinh có điểm trung bình lớn nhất.*/
package truong.e1000.classmanagement;

import truong.e1000.classmanagement.service.ClassManagementService;

public class Main {
    public static void main(String[] args) {
        ClassManagementService service = new ClassManagementService();
        System.out.println("1. Class has the largest number of students");
        service.printClass(service.getLargestStudentNumberClass());
        System.out.println("\n2. Student has the highest average");
        service.printStudent(service.getHighestAverageStudent());
    }
}
