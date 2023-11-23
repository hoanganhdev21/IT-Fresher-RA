package homework_section1;

import java.util.Scanner;

public class GradeCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập điểm từng môn từ người dùng
        System.out.print("Nhập điểm môn Toán: ");
        double mathScore = scanner.nextDouble();

        System.out.print("Nhập điểm môn Văn: ");
        double literatureScore = scanner.nextDouble();

        System.out.print("Nhập điểm môn Anh: ");
        double englishScore = scanner.nextDouble();

        // Tính điểm trung bình
        double averageScore = (mathScore + literatureScore + englishScore) / 3;

        // Đánh giá học lực bằng câu điều kiện rút gọn
        String grade = averageScore >= 9.0 ? "Xuất sắc"
                : averageScore >= 8.0 ? "Giỏi"
                : averageScore >= 6.5 ? "Khá"
                : averageScore >= 5.0 ? "Trung bình"
                : "Yếu";

        // Hiển thị kết quả
        System.out.println("Điểm trung bình: " + averageScore);
        System.out.println("Đánh giá học lực: " + grade);
    }
}
