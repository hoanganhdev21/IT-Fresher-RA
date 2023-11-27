package section3;

import java.util.Scanner;

public class Unit4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Nhập số: ");
        number = scanner.nextInt();
        while (number != 0) {
            System.out.println("Nhập số: ");
            number = scanner.nextInt();
            if (number % 3 == 0) {
                System.out.println(number + " chia hết cho 3.");
            }
        }
    }
}
