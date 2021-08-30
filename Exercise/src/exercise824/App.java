package exercise824;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
//	Viết chương trình thực hiện các yêu cầu sau trên danh sách liên kết các
//	học sinh:
//	a. Khai báo cấu trúc dữ liệu của một danh sách liên kết đơn các học
//	sinh. Biết rằng thông tin của một học sinh bao gồm: họ tên (30 ký
//	tự), điểm toán, điểm văn và điểm trung bình (tất cả là số thực).
//	b. Cài đặt tất cả các thao tác cơ bản cho danh sách liên kết các học
//	sinh.
//	c. Liệt kê các học sinh có điểm toán nhỏ hơn 5 trong danh sách.
//	d. Đếm số lượng học sinh có điểm toán và điểm văn lớn hơn 8 điểm
//	trong danh sách.
//	e. Viết hàm sắp xếp các học sinh giảm dần theo điểm trung bình.
	public static void main(String[] args) {
		List<Student> listStudents = new ArrayList<>();
		listStudents.add(new Student("Grand", "Auto", 5, 10));
		listStudents.add(new Student("Kali", "Niken", 10, 10));
		listStudents.add(new Student("Ali", "Flank", 7, 7));
	}
	public static void listStudentHasMathMarkLessThan5(List<Student> listStudents) {
		for(Student st: listStudents) {
			if(st.getMathMark() < 5) {
				System.out.println(st.getFirstName() + " - " + st.getLastName() + " MathMark: " + st.getMathMark());
			}
		}
	}
	
	public static void countStudentHasLitureMarkHasGreatThan8(List<Student> listStudents) {
		int count = 0;
		for(Student st: listStudents) {
			if(st.getMathMark() > 8) {
				count++;
			}
		}
		System.out.println(count + " students has litureMark great than 8 Mark");
	}
	
	public static void sortStudentByAverageMark(List<Student> listStudents) {
		listStudents.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return (int) (o1.getAverageMark() - o2.getAverageMark());
			}
		});
		
		System.out.println("sort list Student by Average Mark");
		
		for(Student st: listStudents) {
			System.out.println(st.getFirstName() + " - " + st.getLastName() + " Average: " + st.getAverageMark());

		}
	}
}
