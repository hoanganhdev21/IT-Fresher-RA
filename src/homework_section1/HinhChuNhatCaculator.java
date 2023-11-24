package homework_section1;

import java.util.Scanner;

public class HinhChuNhatCaculator {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài từ người dùng
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double chieuDai = scanner.nextDouble();

        // Nhập chiều rộng từ người dùng
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double chieuRong = scanner.nextDouble();

        // Tính chu vi và diện tích
        double chuVi = 2 * (chieuDai + chieuRong);
        double dienTich = chieuDai * chieuRong;

        // In kết quả ra màn hình console
        System.out.println("Chu vi của hình chữ nhật là: " + chuVi);
        System.out.println("Diện tích của hình chữ nhật là: " + dienTich);

    }
}
