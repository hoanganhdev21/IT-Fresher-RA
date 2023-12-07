package Section1_Java.input_output.homework_section1;

import java.util.Scanner;

public class TinhTuoi {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);

        // Nhập năm sinh từ người dùng
        System.out.print("Nhập năm sinh của bạn: ");
        int namSinh = scanner.nextInt();

        // Tính tuổi
        int tuoi = 2023 - namSinh; // VD năm hiện tại là 2023

        // Kiểm tra tuổi là chẵn hay lẻ
        String loaiTuoi = (tuoi % 2 == 0) ? "chẵn" : "lẻ";

        // In kết quả RA_Exercise màn hình console
        System.out.println("Tuổi của bạn là: " + tuoi + " và là tuổi " + loaiTuoi);

    }
}
