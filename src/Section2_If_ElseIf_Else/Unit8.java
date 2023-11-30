package Section2_If_ElseIf_Else;

import java.util.Scanner;

public class Unit8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập ngày, tháng và năm
        System.out.print("Nhập ngày: ");
        int ngay = scanner.nextInt();

        System.out.print("Nhập tháng: ");
        int thang = scanner.nextInt();

        System.out.print("Nhập năm: ");
        int nam = scanner.nextInt();

        // Kiểm tra và in kết quả
        if (kiemTraNgayThangNam(ngay, thang, nam)) {
            System.out.println("Ngày tháng năm hợp lệ.");
        } else {
            System.out.println("Ngày tháng năm không hợp lệ.");
        }
    }

    // Method kiểm tra ngày tháng năm
    public static boolean kiemTraNgayThangNam(int ngay, int thang, int nam) {
        if (nam > 0 && thang >= 1 && thang <= 12) {
            int soNgayTrongThang = soNgayTrongThang(thang, nam);
            return ngay >= 1 && ngay <= soNgayTrongThang;
        }
        return false;
    }

    // Method tính số ngày trong tháng
    public static int soNgayTrongThang(int thang, int nam) {
        switch (thang) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                    return 29; // Năm nhuận
                } else {
                    return 28; // Năm không nhuận
                }
            default:
                return -1; // Tháng không hợp lệ
        }
    }
}
