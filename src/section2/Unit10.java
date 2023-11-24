package section2;

import java.util.Scanner;

public class Unit10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập lương cơ bản và ngày công thực tế
        System.out.print("Nhập lương cơ bản: ");
        double luongCoBan = scanner.nextDouble();

        System.out.print("Nhập ngày công thực tế: ");
        double ngayCongThucTe = scanner.nextDouble();

        // Số ngày công trong tháng
        int soNgayCongTrong1Thang = 26;

        // Tính lương theo công thức
        double luong;
        if (ngayCongThucTe <= soNgayCongTrong1Thang) {
            luong = luongCoBan * (ngayCongThucTe / soNgayCongTrong1Thang);
        } else {
            double ngayCongBinhThuong = soNgayCongTrong1Thang;
            double ngayCongLe = ngayCongThucTe - soNgayCongTrong1Thang;
            luong = luongCoBan * (ngayCongBinhThuong / soNgayCongTrong1Thang)
                    + (1.5 * luongCoBan * ngayCongLe / soNgayCongTrong1Thang);
        }

        // In kết quả
        System.out.println("Lương của nhân viên là: " + luong);
    }
}
