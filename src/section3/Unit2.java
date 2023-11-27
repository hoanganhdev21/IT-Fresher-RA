package section3;

import java.util.Scanner;

public class Unit2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;

        do {
            System.out.print("Nhập số nguyên (nhập 0 để kết thúc): ");
            number = scanner.nextInt();

            if (number % 2 != 0) {
                sum += number;
            }
        } while (number != 0);

        System.out.println("Tổng các số lẻ nhập vào là: " + sum);
    }
}
