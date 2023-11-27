package section3;

import java.util.Scanner;

public class Unit6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất:");
        int num1 = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai:");
        int num2 = scanner.nextInt();

        while (true) {
            System.out.println("**********************CACULATOR**********************");
            System.out.println("1. Tổng 2 số");
            System.out.println("2. Hiệu 2 số");
            System.out.println("3. Tích 2 số");
            System.out.println("4. Thương 2 số");
            System.out.println("5. Số dư trong phép chia 2 số");
            System.out.println("6. Ước chung lớn nhất");
            System.out.println("7. Bội chung nhỏ nhất");
            System.out.println("8. Thoát");
            System.out.println("Lựa chọn của bạn:");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Tổng: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Hiệu: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Tích: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Thương: " + (num1 / num2));
                    } else {
                        System.out.println("Không thể chia cho 0");
                    }
                    break;
                case 5:
                    if (num2 != 0) {
                        System.out.println("Số dư: " + (num1 % num2));
                    } else {
                        System.out.println("Không thể chia cho 0");
                    }
                    break;
                case 6:
                    System.out.println("Ước chung lớn nhất: " + gcd(num1, num2));
                    break;
                case 7:
                    System.out.println("Bội chung nhỏ nhất: " + lcm(num1, num2));
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
