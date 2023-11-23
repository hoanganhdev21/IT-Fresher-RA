package homework_section1;

import java.util.Scanner;

public class RectangleCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài và chiều rộng từ người dùng
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double length = scanner.nextDouble();

        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double width = scanner.nextDouble();

        // Tính chu vi và diện tích
        double perimeter = calculatePerimeter(length, width);
        double area = calculateArea(length, width);

        // Hiển thị kết quả
        System.out.println("Chu vi của hình chữ nhật là: " + perimeter);
        System.out.println("Diện tích của hình chữ nhật là: " + area);
    }

    // Hàm tính toán chu vi và diện tích
    public static double calculatePerimeter(double length, double width) {
        // Chu vi = 2 * (chiều dài + chiều rộng)
        return 2 * (length + width);
    }

    public static double calculateArea(double length, double width) {
        // Diện tích = chiều dài * chiều rộng
        return length * width;
    }
}
