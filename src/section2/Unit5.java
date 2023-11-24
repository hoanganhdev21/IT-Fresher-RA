package section2;

import java.util.Scanner;

public class Unit5 {
    public static void main(String[] args) {
        // Khởi tạo đối tương Scanner
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài 3 cạnh tam giác
        System.out.print("Nhập chiều dài cạnh 1: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập chiều dài cạnh 2: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập chiều dài cạnh 3: ");
        double c = scanner.nextDouble();

        // Kiểm tra và xác định loại tam giác
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Đây là tam giác đều.");
            } else if (a == b || b == c || a == c) {
                if (a * a + b * b == c * c ||
                        a * a + c * c == b * b ||
                        b * b + c * c == a * a) {
                    System.out.println("Đây là tam giác vuông cân.");
                } else {
                    System.out.println("Đây là tam giác cân.");
                }
            } else if (a * a + b * b == c * c ||
                    a * a + c * c == b * b ||
                    b * b + c * c == a * a) {
                System.out.println("Đây là tam giác vuông.");
            } else {
                System.out.println("Đây là tam giác thường.");
            }
        } else {
            System.out.println("Ba cạnh này không tạo thành một tam giác.");
        }
    }
}
