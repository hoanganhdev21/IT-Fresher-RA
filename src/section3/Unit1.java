package section3;

import java.util.Scanner;

public class Unit1 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);

        // Nhập start, end
        System.out.println("Nhập start: ");
        int start = scanner.nextInt();
        System.out.println("Nhập end: ");
        int end = scanner.nextInt();
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i %2 == 0) {
                sum += i;
            }
        }
        System.out.println("Tổng các số chẵn từ " + start + " đến " + end + " là: " + sum);
    }
}
