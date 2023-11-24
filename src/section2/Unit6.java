package section2;

import java.util.Scanner;

public class Unit6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào chỉ số cũ và chỉ số mới
        System.out.print("Nhập chỉ số cũ: ");
        int chiSoCu = scanner.nextInt();

        System.out.print("Nhập chỉ số mới: ");
        int chiSoMoi = scanner.nextInt();

        // Tính số điện tiêu thụ trong tháng
        int soDienTieuThu = chiSoMoi - chiSoCu;

        // Tính tiền điện dựa trên số điện tiêu thụ
        double giaDien;
        if (soDienTieuThu < 50) {
            giaDien = 10000;
        } else if (soDienTieuThu < 100) {
            giaDien = 15000;
        } else if (soDienTieuThu < 150) {
            giaDien = 20000;
        } else if (soDienTieuThu < 200) {
            giaDien = 25000;
        } else {
            giaDien = 30000;
        }

        // Tính tổng tiền điện
        double tongTienDien = soDienTieuThu * giaDien;

        // In thông tin tiền điện
        System.out.println("Số điện tiêu thụ trong tháng: " + soDienTieuThu + " kWh");
        System.out.println("Giá điện: " + giaDien + " VNĐ/kWh");
        System.out.println("Tổng tiền điện: " + tongTienDien + " VNĐ");
    }
}
