package BTLab4;
import java.util.Scanner;
public class Bai2 {
	private String tenSp;
    private double donGia;
    private double giamGia;
    public double getThueNhapKhau() {
        return donGia * 0.1;
    }
    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSp = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
        System.out.print("Nhập giảm giá: ");
        giamGia = scanner.nextDouble();
    }
    public static void main(String[] args) {
    	Bai2 sp1 = new Bai2();
        System.out.println("Nhập thông tin cho sản phẩm 1:");
        sp1.nhap();
        System.out.println();
        Bai2 sp2 = new Bai2();
        System.out.println("Nhập thông tin cho sản phẩm 2:");
        sp2.nhap();
        System.out.println();
        System.out.println("Thông tin của sản phẩm 1:");
        sp1.xuat();
        System.out.println();
        System.out.println("Thông tin của sản phẩm 2:");
        sp2.xuat();
    }
}
