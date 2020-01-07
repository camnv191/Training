package BT2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GiaoVienDAO {
	Scanner sc = new Scanner(System.in);
	List<GiaoVien> DanhSachGV = new ArrayList<>();
	 public void hienthi() {
		 for(int i =0 ; i < DanhSachGV.size();i++) {
			 System.out.println(DanhSachGV.get(i));
		 }
	 }
	  
	 public void nhap() {
		 GiaoVien gv = new GiaoVien();
		 System.out.print("nhập ID: ");
		 gv.setID(sc.next());
		 System.out.println("nhập họ và tên");
		 gv.setHovaten(sc.next());
		 sc.nextLine();
		 System.out.println("nhập ngày sinh");
		 gv.setNgaysinh(LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		 System.out.println("nhập lương");
		 gv.setLuong(sc.nextDouble());
		 DanhSachGV.add(gv);
	 }
	 
	 public void xoa(String id) {
		 for(int i =0; i < DanhSachGV.size();i++) {
			 if(id.equals(DanhSachGV.get(i).getID())) {
				 DanhSachGV.remove(i);
			 }
		 }
	 }
	 
	 public void sapxep() {
		 Collections.sort(DanhSachGV);
		 hienthi();
	 }
	 
	 public void tuoi() {
		 Collections.sort(DanhSachGV, (a, b) -> {
			 return (-1) * (a.getTuoi() - b.getTuoi());
		 });
		 GiaoVien giaoVienLonTuoiNhat = DanhSachGV.get(0);
		 System.out.println(giaoVienLonTuoiNhat);
	 }
	 
	 public void khoangtg() {
		for(int i =0; i< DanhSachGV.size(); i++) {
			if(DanhSachGV.get(i).getThang() >= 2 && DanhSachGV.get(i).getThang()<=5 
					&& DanhSachGV.get(i).getNam() ==1996) {
				System.out.println("những giáo viên thõa mãn");
				System.out.println(DanhSachGV.get(i));
			}
		}
	 }
}
