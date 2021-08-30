package exercise823;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class App {
//	 Viết chương trình thực hiện các yêu cầu sau trên danh sách liên kết đơn
//	 các nhân viên:
//	 a. Khai báo cấu trúc dữ liệu của một danh sách liên kết đơn các nhân
//	 viên. Biết rằng thông tin của một nhân viên bao gồm: họ tên (30 ký
//	 tự), ngày sinh (kiểu ngày), lương (số thực), giới tính (0. Nữ, 1.
//	 Nam).
//	 b. Cài đặt tất cả các thao tác cơ bản cho danh sách liên kết các nhân
//	 viên.
//	 c. Liệt kê các nhân viên trên 40 tuổi trong danh sách.
//	 d. Đếm số lượng nhân viên có lương lớn hơn 1.000.000 đồng trong
//	 danh sách.
//	 e. Viết hàm sắp xếp các nhân viên giảm dần theo năm sinh (không
//	 quan tâm ngày và tháng sinh).
	public static void main(String[] args) {
		Employees employee1 = new Employees("Adam", "John", 1,"123456", new Date(3, 4, 1991), 100000000);
		Employees employee2 = new Employees("David", "Dgea", 0,"123456", new Date(3, 8, 1992), 40000000);
		Employees employee3 = new Employees("Evan", "Frank", 1,"123456", new Date(3, 10, 1996), 500000);

		List<Employees> listEmloyees = new ArrayList<>();
		listEmloyees.add(employee1);
		listEmloyees.add(employee2);
		listEmloyees.add(employee3);
		
		listEmployeesHasAgeGreatThan40(listEmloyees);
		listEmployeesHasSalaryGreatThan1M(listEmloyees);
		sortListEmployees(listEmloyees);
	}
	
	public static void listEmployeesHasAgeGreatThan40(List<Employees> list) {
		int currentYear = LocalDate.now().getYear(); 
		for(Employees e : list) {
			int age = (currentYear - e.getBirthDay().getYear());
			if(age >= 40) {
				System.out.println(e.getFirstName() + " - " + e.getLastName() + " age: " + age);
			}
		}
	}
	
	public static void listEmployeesHasSalaryGreatThan1M(List<Employees> list) {
		for(Employees e : list) {
			if(e.getSalary() >= 100000000) {
				System.out.println(e.getFirstName() + " - " + e.getLastName() + " salary: " + e.getSalary());
			}
		}
	}
	
	public static void sortListEmployees(List<Employees> list) {
		int currentYear = LocalDate.now().getYear(); 
		list.sort(new Comparator<Employees>() {

			@Override
			public int compare(Employees o1, Employees o2) {
				int age1 = (currentYear - o1.getBirthDay().getYear());
				int age2 = (currentYear - o2.getBirthDay().getYear());
				return age1-age2;
			}
			
		});
		
		System.out.println("Sort list of employess");
		
		for(Employees e : list) {
			int age = (currentYear - e.getBirthDay().getYear());
			System.out.println(e.getFirstName() + " - " + e.getLastName() + " salary: " + " age: " + age);
		}
	}
	
}
