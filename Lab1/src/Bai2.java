/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanncer =new Scanner(System.in);
		System.out.print("Nhập chiều dài hcn: ");
		double CD = scanncer.nextDouble();
		System.out.print("Nhập chiều rộng hcn: ");
		double CR = scanncer.nextDouble();
		double CV=(CD+CR)*2;
		double DT=CD*CR;
		System.out.printf("Chu vi hcn: %f",CV);
		System.out.printf("\nDiện tích hcn: %f",DT);
		System.out.printf("\nCạnh nhỏ nhất hcn: %f",Math.min(CD, CR));
	}

}
