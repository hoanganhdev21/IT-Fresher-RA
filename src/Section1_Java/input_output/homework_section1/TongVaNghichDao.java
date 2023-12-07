package Section1_Java.input_output.homework_section1;

import java.util.Scanner;

public class TongVaNghichDao {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên có 4 chữ số từ người dùng
        System.out.print("Nhập một số nguyên có 4 chữ số: ");
        int soNguyen = scanner.nextInt();

        // Kiểm tra xem số có đúng 4 chữ số hay không
        if (soNguyen >= 1000 && soNguyen <= 9999) {
            // Tính tổng các chữ số
            int tongChuSo = 0;
            int soDu;
            int temp = soNguyen;

            while (temp > 0) {
                soDu = temp % 10;
                tongChuSo += soDu;
                temp /= 10;
            }

            // Tính số nghịch đảo
            int soNghichDao = 0;
            temp = soNguyen;

            while (temp > 0) {
                soDu = temp % 10;
                soNghichDao = soNghichDao * 10 + soDu;
                temp /= 10;
            }

            // In kết quả ra_exercise màn hình console
            System.out.println("Tổng các chữ số là: " + tongChuSo);
            System.out.println("Số nghịch đảo là: " + soNghichDao);
        } else {
            System.out.println("Vui lòng nhập số nguyên có 4 chữ số.");
        }

    }
}
