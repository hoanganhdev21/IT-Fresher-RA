package Section3__Loops;

import java.util.Scanner;

public class Unit8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên n: ");
        int n = scanner.nextInt();
        int opt;
        do {
            System.out.println("**********************PRACTICE**********************");
            System.out.println("1. In dãy số chia hết cho 2 và giảm dần (n >= số >= 2)");
            System.out.println("2. In các số nhỏ hơn n và tính tổng");
            System.out.println("3. In RA_Exercise các ước số chẵn của n");
            System.out.println("4. In RA_Exercise các ước số lẻ và số lượng các ước lẻ của n");
            System.out.println("5. In RA_Exercise ước số lẻ lớn nhất của n");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            opt = scanner.nextInt();
            switch (opt) {
                case 1:
                    for (int i = n; i >= 2; i--) {
                        if (i % 2 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 2:
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        System.out.print(i + " ");
                        sum += i;
                    }
                    System.out.println("\nTổng: " + sum);
                    break;
                case 3:
                    System.out.print("Các ước số chẵn của " + n + " là: ");
                    for (int i = 1; i <= n; i++) {
                        if (n % i == 0 && i % 2 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    int count = 0;
                    System.out.print("Các ước số lẻ của " + n + " là: ");
                    for (int i = 1; i <= n; i++) {
                        if (n % i == 0 && i % 2 != 0) {
                            System.out.print(i + " ");
                            count++;
                        }
                    }
                    System.out.println("\nSố lượng các ước lẻ: " + count);
                    break;
                case 5:
                    int maxOddDivisor = 1;
                    for (int i = 1; i <= n; i++) {
                        if (n % i == 0 && i % 2 != 0) {
                            maxOddDivisor = i;
                        }
                    }
                    System.out.println("Ước số lẻ lớn nhất của " + n + " là: " + maxOddDivisor);
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        } while (opt != 6);
    }
}
