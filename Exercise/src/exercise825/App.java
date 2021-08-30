package exercise825;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
//	 Viết chương trình thực hiện các yêu cầu sau:
//		 a. Khai báo cấu trúc dữ liệu của một danh sách liên kết đơn toạ độ các
//		 điểm trong mặt phẳng Oxy.
//		 b. Cài đặt tất cả các thao tác cơ bản cho danh sách liên kết toạ độ điểm
//		 trong mặt phẳng Oxy.
//		 c. Liệt kê các toạ độ các điểm trong phần tư thứ I của mặt phẳng Oxy.
//		 d. Tìm điểm có tung độ lớn nhất trong danh sách.
//		 e. Viết hàm sắp xếp toạ độ các điểm giảm dần theo khoảng cách từ nó
//		 đến gốc toạ độ.
	public static void main(String[] args) {
		List<Oxy> list = new ArrayList<>();
		list.add(new Oxy(1, 0));
		list.add(new Oxy(-3, 5));
		list.add(new Oxy(5, 6));
		list.add(new Oxy(-3,-6));
	}
	
	public static void listOxy(List<Oxy> list) {
		for(Oxy o: list) {
			if(o.getX() > 0 || o.getY() > 0) {
				System.out.println("(" + o.getX() + "," + o.getY() + ")");
			}
		}
	}
	
	public static void findMaxy(List<Oxy> list) {
		Oxy max = list.get(0);
		for(Oxy o: list) {
			if(max.getY() < o.getY()) {
				max = o;
			}
		}
		System.out.println("(" + max.getX() + "," + max.getY() + ")");
	}
	
	public static void sortListOxy(List<Oxy> list) {
		list.sort(new Comparator<Oxy>() {

			@Override
			public int compare(Oxy o1, Oxy o2) {
				double range1 = Math.pow(o1.getX(), 2) + Math.pow(o2.getY(),2);
				double range2 = Math.pow(o2.getX(), 2) + Math.pow(o2.getY(),2);
				return (int) (range1-range2);
			}
		});
		
		for(Oxy o: list) {
			System.out.println("(" + o.getX() + "," + o.getY() + ")");
		}
		
	}
}
