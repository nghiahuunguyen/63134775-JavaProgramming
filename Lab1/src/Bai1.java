/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Họ và tên: ");
		String hoTen = scanner.nextLine();
		System.out.print("Điểm trung bình: ");
		double diemTB = scanner.nextDouble();
		System.out.printf("%s %.1f điểm",hoTen,diemTB);
	}

}
