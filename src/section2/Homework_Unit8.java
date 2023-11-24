package section2;

import java.util.Scanner;

public class Homework_Unit8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        do {
            System.out.println("Nhập 3 cạnh của tam giác:");
            System.out.print("Nhập cạnh 1: ");
            a = scanner.nextDouble();
            System.out.print("Nhập cạnh 2: ");
            b = scanner.nextDouble();
            System.out.print("Nhập cạnh 3: ");
            c = scanner.nextDouble();

            if (!laTamGiacHopLe(a, b, c)) {
                System.out.println("Ba cạnh bạn nhập vào không tạo thành tam giác. Hãy vui lòng nhập lại cảm ơn!");
            }
        } while (!laTamGiacHopLe(a, b, c));

        double chuVi = tinhChuVi(a, b, c);
        double dienTich = tinhDienTich(a, b, c);

        System.out.println("Chu vi tam giác là: " + chuVi);
        System.out.println("Diện tích tam giác là: " + dienTich);
    }

    public static boolean laTamGiacHopLe(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static double tinhChuVi(double a, double b, double c) {
        return a + b + c;
    }

    public static double tinhDienTich(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
