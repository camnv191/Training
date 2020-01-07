package BT2;
import java.time.LocalDate;
import java.time.Month;

public class GiaoVien implements Comparable<GiaoVien> {
	private String ID;
	private String hovaten;
	private LocalDate ngaysinh;
	private Double luong;
	
	public GiaoVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaoVien(String iD, String hovaten, LocalDate ngaysinh, Double luong) {
		super();
		ID = iD;
		this.hovaten = hovaten;
		this.ngaysinh = ngaysinh;
		this.luong = luong;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getHovaten() {
		return hovaten;
	}

	public void setHovaten(String hovaten) {
		this.hovaten = hovaten;
	}

	public LocalDate getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(LocalDate ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public Double getLuong() {
		return luong;
	}

	public void setLuong(Double luong) {
		this.luong = luong;
	}
	
	public int getTuoi() {
		return LocalDate.now().getYear() - this.ngaysinh.getYear();
	}
	
	public int getThang() {
		return this.ngaysinh.getMonthValue();
	}
	public int getNam() {
		return this.ngaysinh.getYear();
	}

	@Override
	public String toString() {
		return "GiaoVien [ID=" + ID + ", hovaten=" + hovaten + ", ngaysinh=" + ngaysinh + ", luong=" + luong
				+ ", getTuoi()=" + getTuoi() + "]";
	}

	@Override
	public int compareTo(GiaoVien arg0) {
		return (int) (this.luong - arg0.getLuong());
	}
	
	
}
