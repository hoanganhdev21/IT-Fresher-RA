package section2;

import java.util.Scanner;

public class Unit7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập năm và tháng
        System.out.print("Nhập năm: ");
        int nam = scanner.nextInt();

        System.out.print("Nhập tháng (1-12): ");
        int thang = scanner.nextInt();

        // Kiểm tra và in số ngày trong tháng
        int soNgay = -1; // Giả sử tháng không hợp lệ

        if (thang >= 1 && thang <= 12) {
            if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
                soNgay = 31;
            } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
                soNgay = 30;
            } else {
                // Kiểm tra năm nhuận
                if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                    soNgay = 29;
                } else {
                    soNgay = 28;
                }
            }

            System.out.println("Tháng " + thang + " năm " + nam + " có " + soNgay + " ngày.");
        } else {
            System.out.println("Tháng không hợp lệ. Vui lòng nhập tháng từ 1 đến 12.");
        }
    }
}
