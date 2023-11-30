package Section3__Loops;

import java.util.Scanner;

public class Unit7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 3 số nguyên:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        while (true) {
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<< CACULATOR >>>>>>>>>>>>>>>>>>>>>");
            System.out.println("1. Tổng 3 số nguyên");
            System.out.println("2. Trung bình cộng của 3 số nguyên");
            System.out.println("3. Số lớn nhất, nhỏ nhất trong 3 số");
            System.out.println("4. Thoát");
            System.out.println("Lựa chọn của bạn:");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Tổng là: " + (a + b + c));
                    break;
                case 2:
                    System.out.println("Trung bình cộng là: " + ((a + b + c) / 3.0));
                    break;
                case 3:
                    int max = Math.max(a, Math.max(b, c));
                    int min = Math.min(a, Math.min(b, c));
                    System.out.println("Số lớn nhất là: " + max);
                    System.out.println("Số nhỏ nhất là: " + min);
                    break;
                case 4:
                    System.out.println("Thoát");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }
}
