package section2;

import java.util.Scanner;

public class Homework_Unit7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int luaChon;

        do {
            hienThiMenu();
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    tinhChuViDienTichHinhChuNhat();
                    break;
                case 2:
                    tinhChuViDienTichHinhTamGiac();
                    break;
                case 3:
                    tinhChuViDienTichHinhTron();
                    break;
                case 0:
                    System.out.println("Ứng dụng kết thúc. Tạm biệt hẹn gặp lại!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                    break;
            }

        } while (luaChon != 0);
    }

    public static void hienThiMenu() {
        System.out.println("----- Menu -----");
        System.out.println("1. Tính chu vi và diện tích hình chữ nhật");
        System.out.println("2. Tính chu vi và diện tích hình tam giác");
        System.out.println("3. Tính chu vi và diện tích hình tròn");
        System.out.println("0. Thoát");
        System.out.println("-----------------<3<3<3------------------");
    }

    public static void tinhChuViDienTichHinhChuNhat() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài hình chữ nhật: ");
        double chieuDai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double chieuRong = scanner.nextDouble();

        double chuVi = 2 * (chieuDai + chieuRong);
        double dienTich = chieuDai * chieuRong;

        System.out.println("Chu vi hình chữ nhật là: " + chuVi);
        System.out.println("Diện tích hình chữ nhật là: " + dienTich);
    }

    public static void tinhChuViDienTichHinhTamGiac() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập độ dài cạnh 1: ");
        double canh1 = scanner.nextDouble();
        System.out.print("Nhập độ dài cạnh 2: ");
        double canh2 = scanner.nextDouble();
        System.out.print("Nhập độ dài cạnh 3: ");
        double canh3 = scanner.nextDouble();

        double chuVi = canh1 + canh2 + canh3;
        double p = chuVi / 2;
        double dienTich = Math.sqrt(p * (p - canh1) * (p - canh2) * (p - canh3));

        System.out.println("Chu vi hình tam giác là: " + chuVi);
        System.out.println("Diện tích hình tam giác là: " + dienTich);
    }

    public static void tinhChuViDienTichHinhTron() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập bán kính hình tròn: ");
        double banKinh = scanner.nextDouble();

        double chuVi = 2 * Math.PI * banKinh;
        double dienTich = Math.PI * Math.pow(banKinh, 2);

        System.out.println("Chu vi hình tròn là: " + chuVi);
        System.out.println("Diện tích hình tròn là: " + dienTich);
    }
}
