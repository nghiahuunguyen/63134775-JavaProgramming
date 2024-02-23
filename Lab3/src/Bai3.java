import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        // Sắp xếp và xuất mảng
        Arrays.sort(a);
        System.out.println("Mảng đã sắp xếp:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // Tìm và xuất phần tử nhỏ nhất
        int min = a[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, a[i]);
        }
        System.out.println("Phần tử nhỏ nhất trong mảng: " + min);

        // Tính và xuất trung bình cộng các phần tử chia hết cho 3
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 3 == 0) {
                sum += a[i];
                count++;
            }
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Trung bình cộng các phần tử chia hết cho 3: " + average);
        } else {
            System.out.println("Không có phần tử nào chia hết cho 3 trong mảng.");
        }
    }

}