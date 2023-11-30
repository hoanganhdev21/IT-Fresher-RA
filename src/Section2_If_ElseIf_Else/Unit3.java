package Section2_If_ElseIf_Else;

import java.util.Scanner;

public class Unit3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("nhap vao so nguyen thu 1 :");
        int  number1 = scanner.nextInt();

        System.out.printf("nhap vao so nguyen thu 2 :");
        int  number2 = scanner.nextInt();


        int total = number1 + number2 ;

        System.out.printf("ket qua cua phep tinh: " + total);
    }
}
