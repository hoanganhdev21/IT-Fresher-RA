package Section1_Java.input_output.homework_section1;

import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);

        // Nhập 3 giá trị số nguyên từ người dùng
        System.out.print("Nhập số nguyên thứ nhất: ");
        int soNguyen1 = scanner.nextInt();

        System.out.print("Nhập số nguyên thứ hai: ");
        int soNguyen2 = scanner.nextInt();

        System.out.print("Nhập số nguyên thứ ba: ");
        int soNguyen3 = scanner.nextInt();

        // Tìm số nguyên lớn nhất và số nguyên nhỏ nhất
        int max = Math.max(soNguyen1, Math.max(soNguyen2, soNguyen3));
        int min = Math.min(soNguyen1, Math.min(soNguyen2, soNguyen3));

        // In kết quả ra_exercise màn hình console
        System.out.println("Số nguyên lớn nhất là: " + max);
        System.out.println("Số nguyên nhỏ nhất là: " + min);

    }
}
