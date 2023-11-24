package section2;

import java.util.Scanner;

public class Homework_Unit5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giới hạn trên: ");
        int gioiHan = scanner.nextInt();

        int soNguyenDuongNhoNhat = timSoChiaHet(gioiHan);
        System.out.println("Số nguyên dương nhỏ nhất chia hết cho 5, 7 và 11 là: " + soNguyenDuongNhoNhat);
    }

    public static int timSoChiaHet(int gioiHan) {
        int soNguyenDuong = 1;

        while (true) {
            if (soNguyenDuong % 5 == 0 && soNguyenDuong % 7 == 0 && soNguyenDuong % 11 == 0 && soNguyenDuong <= gioiHan) {
                return soNguyenDuong;
            }
            soNguyenDuong++;
        }
    }
    public static void kiemTraChanLe() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số cần kiểm tra: ");
        int so = scanner.nextInt();

        if (so % 2 == 0) {
            System.out.println(so + " là số chẵn.");
        } else {
            System.out.println(so + " là số lẻ.");
        }
    }

    public static void kiemTraSoNguyenTo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số cần kiểm tra: ");
        int so = scanner.nextInt();

        boolean laNguyenTo = true;

        if (so <= 1) {
            laNguyenTo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(so); i++) {
                if (so % i == 0) {
                    laNguyenTo = false;
                    break;
                }
            }
        }

        if (laNguyenTo) {
            System.out.println(so + " là số nguyên tố.");
        } else {
            System.out.println(so + " không là số nguyên tố.");
        }
    }

    public static void kiemTraChiaHetCho3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số cần kiểm tra: ");
        int so = scanner.nextInt();

        if (so % 3 == 0) {
            System.out.println(so + " chia hết cho 3.");
        } else {
            System.out.println(so + " không chia hết cho 3.");
        }
    }
}
