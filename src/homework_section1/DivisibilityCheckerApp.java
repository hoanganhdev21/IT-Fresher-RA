package homework_section1;

import java.util.Scanner;

public class DivisibilityCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số tự nhiên từ người dùng
        System.out.print("Nhập vào một số tự nhiên: ");
        int number = scanner.nextInt();

        // Kiểm tra và hiển thị kết quả bằng câu điều kiện rút gọn
        String result = (number % 3 == 0) && (number % 5 == 0) ? "chia hết cho cả 3 và 5" : "không chia hết cho cả 3 và 5";
        System.out.println(number + " " + result);
    }
}
