package homework_section1;

import java.util.Scanner;

public class NhapVaoSoNguyen {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên
        System.out.print("Nhập một số nguyên: ");
        int soNguyen = scanner.nextInt();

        // Tính bình phương
        int binhPhuong = soNguyen * soNguyen;

        // In kết quả ra màn hình console
        System.out.println("Bình phương của " + soNguyen + " là " + binhPhuong);

    }
}
