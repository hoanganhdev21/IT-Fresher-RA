package section2;

import java.util.Scanner;

public class Unit1 {
    public static void main(String[] args) {
        // Khởi tạo đối tượng scanner
        Scanner scanner = new Scanner(System.in);

        // Nhập vào một số từ bàn phím
        System.out.println("Nhập vào một số nguyên từ bàn phím: ");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.printf("Số" + number + "Là số chẵn");
        }else{
            System.out.printf("Số " + number + "Là số lẻ");
        }
    }
}
