package Section1_Java.input_output.homework_section1;

import java.util.Scanner;

public class HinhTronCaculator {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);

        // Nhập bán kính từ người dùng
        System.out.print("Nhập bán kính của hình tròn: ");
        double banKinh = scanner.nextDouble();

        // Tính chu vi và diện tích
        double chuVi = 2 * Math.PI * banKinh;
        double dienTich = Math.PI * Math.pow(banKinh, 2);

        // In kết quả ra_exercise màn hình console với định dạng số thập phân
        System.out.printf("Chu vi của hình tròn là: %.2f\n", chuVi);
        System.out.printf("Diện tích của hình tròn là: %.2f\n", dienTich);

    }
}
