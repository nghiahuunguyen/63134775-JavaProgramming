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
		System.out.print("Nhập a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhập b: ");
		double b= scanner.nextDouble();
		if(a==0) {
			if(b==0)
				System.out.println("Phương trình vô số nghiệm");
			else 
				System.out.println("Phương trình vô nghiệm");
		}else 
			System.out.printf("Phương trình có nghiêm x = %f",-b/a);
			
	}

}
