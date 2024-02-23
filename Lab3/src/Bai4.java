/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();

        String[] hoTen = new String[n];
        double[] diem = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
            scanner.nextLine(); 
            System.out.print("Họ và tên: ");
            hoTen[i] = scanner.nextLine();
            System.out.print("Điểm: ");
            diem[i] = scanner.nextDouble();
        }
        System.out.println("Thông tin các sinh viên:");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ " + (i + 1) + ":");
            System.out.println("Họ tên: " + hoTen[i]);
            System.out.println("Điểm: " + diem[i]);
            String hocLuc = "";
            if (diem[i] < 5) {
                hocLuc = "Yếu";
            } else if (diem[i] < 6.5) {
                hocLuc = "Trung bình";
            } else if (diem[i] < 7.5) {
                hocLuc = "Khá";
            } else if (diem[i] < 9) {
                hocLuc = "Giỏi";
            } else {
                hocLuc = "Xuất sắc";
            }
            System.out.println("Học lực: " + hocLuc);
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] > diem[j]) {
                    // Hoán đổi điểm
                    double tempDiem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tempDiem;
                    // Hoán đổi họ tên
                    String tempHoTen = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tempHoTen;
                }
            }
        }
        System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm tăng dần:");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ " + (i + 1) + ":");
            System.out.println("Họ tên: " + hoTen[i]);
            System.out.println("Điểm: " + diem[i]);
            System.out.println();
        }
	}

}
