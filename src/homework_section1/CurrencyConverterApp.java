package homework_section1;

import java.util.Scanner;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập giá trị tiền USD
        System.out.print("Nhập giá trị tiền USD: ");
        double usdAmount = scanner.nextDouble();

        // Nhập tỉ giá 23000VNĐ/1USD
        System.out.print("Nhập tỉ giá  (VND/USD): ");
        double exchangeRate = scanner.nextDouble();

        // Tính giá trị tiền VNĐ
        double vndAmount = convertToVND(usdAmount, exchangeRate);

        // Hiển thị kết quả
        System.out.println(usdAmount + " USD = " + vndAmount + " VND");
    }

    public static double convertToVND(double usdAmount, double exchangeRate) {
        // Chuyển đổi từ USD sang VND bằng cách nhân giá trị tiền USD với tỉ giá 23000VNĐ
        return usdAmount * exchangeRate;
    }
}
