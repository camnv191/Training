package BT2;

import java.util.Scanner;

public class MainGV {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GiaoVienDAO gvd = new GiaoVienDAO();
		
		
		while (true) {
			System.out.println("1. thêm giáo viên mới");
			System.out.println("2. hiển thị danh sách giáo viên");
			System.out.println("3. sắp xếp giáo viên theo lương");
			System.out.println("4. hiển thị giáo viên cao tuổi nhất");
			System.out.println("5. xóa giáo viên");
			System.out.println("6. hiển thị giáo viên sinh từ 2/1996 - 5/1996");
			System.out.println("7. thoát chương trình");
			System.out.print("nhập stt của chức năng mà bạn cần: ");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				System.out.println("thêm giáo viên mới");
				gvd.nhap();
				break;
			case 2:
				System.out.println("Hiện thị danh sách giáo viên");
				gvd.hienthi();
				break;
			case 3:
				System.out.println("Sắp xếp giáo viên theo mức lương");
				gvd.sapxep();
				break;
			case 4:
				System.out.println("hiển thị giáo viên cao tuổi nhất");
				gvd.tuoi();
				break;
			case 5:
				System.out.println("nhập id cần xóa");
				String id = sc.next();
				gvd.xoa(id);
				break;
			case 6:
				gvd.khoangtg();
				break;
			case 7:
				System.exit(0);
			default:
				break;
			}
		}
	}

}
