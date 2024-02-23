import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        boolean ok = true;
        
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                ok = false;
                break;
            }
        }
        
        if (ok) 
            System.out.printf("%d là số nguyên tố", n);
        else
            System.out.printf("%d không phải số nguyên tố", n);
    }
}