package Section1_Java.input_output.homework_section1;

import java.util.Scanner;

public class DiemTrungBinhCaculator {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);

        // Nhập điểm toán
        System.out.print("Nhập điểm toán: ");
        double diemToan = scanner.nextDouble();

        // Nhập điểm văn
        System.out.print("Nhập điểm văn: ");
        double diemVan = scanner.nextDouble();

        // Nhập điểm anh
        System.out.print("Nhập điểm anh: ");
        double diemAnh = scanner.nextDouble();

        // Tính tổng điểm và điểm trung bình
        double tongDiem = diemToan + diemVan + diemAnh;
        double diemTrungBinh = tongDiem / 3;

        // In kết quả RA_Exercise màn hình console với định dạng số thập phân
        System.out.printf("Tổng điểm là: %.2f\n", tongDiem);
        System.out.printf("Điểm trung bình là: %.2f\n", diemTrungBinh);

    }
}
