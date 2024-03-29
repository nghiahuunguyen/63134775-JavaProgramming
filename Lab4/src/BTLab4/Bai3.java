package BTLab4;
import java.util.Scanner;

public class Bai3 {
	private String tenSp;
    private double donGia;
    private double giamGia;
    public Bai3(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    public Bai3(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }
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
        Bai3 sp1 = new Bai3("Máy giặt", 1000, 100);
        Bai3 sp2 = new Bai3("Tủ lạnh", 2000);
        System.out.println("Thông tin của sản phẩm 1:");
        sp1.xuat();
        System.out.println();
        System.out.println("Thông tin của sản phẩm 2:");
        sp2.xuat();
    }
}
