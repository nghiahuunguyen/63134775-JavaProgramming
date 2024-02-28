package BTLab4;
import java.util.Scanner;

public class Bai4 {
	private String tenSp;
    private double donGia;
    private double giamGia;
    public Bai4(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    public Bai4(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }
    public double getThueNhapKhau() {
        return donGia * 0.1;
    }
    public String getTenSp() {
        return tenSp;
    }
    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getGiamGia() {
        return giamGia;
    }
    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
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
        Bai4 sp1 = new Bai4("Điện thoại", 1000, 100);
        Bai4 sp2 = new Bai4("Máy tính", 2000);
        System.out.println("Thông tin của sản phẩm 1:");
        System.out.println("Tên sản phẩm: " + sp1.getTenSp());
        System.out.println("Đơn giá: " + sp1.getDonGia());
        System.out.println("Giảm giá: " + sp1.getGiamGia());
        System.out.println("Thuế nhập khẩu: " + sp1.getThueNhapKhau());
        System.out.println();
        System.out.println("Thông tin của sản phẩm 2:");
        System.out.println("Tên sản phẩm: " + sp2.getTenSp());
        System.out.println("Đơn giá: " + sp2.getDonGia());
        System.out.println("Giảm giá: " + sp2.getGiamGia());
        System.out.println("Thuế nhập khẩu: " + sp2.getThueNhapKhau());
    }
}
