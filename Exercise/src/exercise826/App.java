package exercise826;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
//	 Viết chương trình thực hiện các yêu cầu sau:
//		 a. Hãy khai báo cấu trúc dữ liệu của một danh sách liên kết đơn các
//		 hộp sữa (HOPSUA). Biết rằng một hộp sữa gồm những thành phần
//		 như sau: Nhãn hiệu (chuỗi tối đa 20 ký tự), Trọng lượng (kiểu số
//		 thực), hạn sử dụng (kiểu dữ liệu ngày).
//		 b. Cài đặt tất cả các thao tác cơ bản cho danh sách liên kết các hộp
//		 sữa.
//		 c. Đếm số lượng hộp sữa sản xuất trước năm 2003 trong danh sách.
//		 d. Tìm hộp sữa mới nhất trong danh sách.
//		 e. Sắp xếp các hộp sữa tăng dần theo hạn sử dụng.

	public static void main(String[] args) {
		List<MilkBottle> listMilkBottle = new ArrayList<MilkBottle>();
		listMilkBottle.add(new MilkBottle("Vinamilk", 33, new Date(3, 11, 2021)));
		listMilkBottle.add(new MilkBottle("Vinamilk", 33, new Date(6, 11, 2021)));
		listMilkBottle.add(new MilkBottle("TH", 33, new Date(12, 11, 2021)));
	}

	public static void countMilkBottleHasExpirationTimeOverBefore2022(List<MilkBottle> listMilkBottle) {
		int count = 0;
		for (MilkBottle mb : listMilkBottle) {
			if (mb.getExpirationTime().getYear() < 2020) {
				count++;
			}
		}

		System.out.println(count + " milk bottle has expiration time over before 2022");
	}
	
	public static void sortList(List<MilkBottle> listMilkBottle) {
		listMilkBottle.sort(new Comparator<MilkBottle>() {

			@Override
			public int compare(MilkBottle o1, MilkBottle o2) {
				if(o1.getExpirationTime().getYear() < o2.getExpirationTime().getYear()) {
					return -1;
				}else if(o1.getExpirationTime().getYear() > o2.getExpirationTime().getYear()) {
					return 1;
				}else {
					if(o1.getExpirationTime().getMonth() < o2.getExpirationTime().getMonth()) {
						return -1;
					}else if(o1.getExpirationTime().getMonth() > o2.getExpirationTime().getMonth()) {
						return 1;
					}else {
						if(o1.getExpirationTime().getDay() < o2.getExpirationTime().getDay()) {
							return -1;
						}else if(o1.getExpirationTime().getDay() > o2.getExpirationTime().getDay()) {
							return 1;
						}
						return 0;
					}
				}
			}
		});
	}
}
