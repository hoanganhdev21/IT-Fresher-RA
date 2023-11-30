package Section2_If_ElseIf_Else;

import java.util.Scanner;

public class Homework_Unit2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int luaChon;
        do {
            hienThiMenu();
            System.out.print("Nhập lựa chọn của bạn (0 để thoát): ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    hienThiHinhChuNhat();
                    break;
                case 2:
                    hienThiHinhTamGiac();
                    break;
                case 3:
                    hienThiHinhVuong();
                    break;
                case 0:
                    System.out.println("Ứng dụng kết thúc. Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                    break;
            }

        } while (luaChon != 0);

    }

    public static void hienThiMenu() {
        System.out.println("----- Menu -----");
        System.out.println("1. Hiển thị hình chữ nhật");
        System.out.println("2. Hiển thị hình tam giác");
        System.out.println("3. Hiển thị hình vuông");
        System.out.println("0. Thoát");
        System.out.println("-----------------");
    }

    public static void hienThiHinhChuNhat() {
        int rows = 4; // Số dòng của hình chữ nhật
        int cols = 8; // Số cột của hình chữ nhật
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hienThiHinhTamGiac() {
        int n = 5; // Số dòng của hình tam giác
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hienThiHinhVuong () {
            int n = 5; // Số dòng và cột của hình vuông
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
    }


}
