package Section2_If_ElseIf_Else;

import java.util.Scanner;

public class Unit9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào 3 số
        System.out.print("Nhập số thứ 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Nhập số thứ 2: ");
        int num2 = scanner.nextInt();

        System.out.print("Nhập số thứ 3: ");
        int num3 = scanner.nextInt();

        // Sắp xếp 3 số giảm dần
        int max, mid, min;

        // Tìm số lớn nhất
        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num1 && num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }

        // Tìm số nhỏ nhất
        if (num1 < num2 && num1 < num3) {
            min = num1;
        } else if (num2 < num1 && num2 < num3) {
            min = num2;
        } else {
            min = num3;
        }

        // Tìm số nằm giữa
        if ((num1 != max) && (num1 != min)) {
            mid = num1;
        } else if ((num2 != max) && (num2 != min)) {
            mid = num2;
        } else {
            mid = num3;
        }

        // In ra 3 số theo thứ tự giảm dần
        System.out.println("Số theo thứ tự giảm dần: " + max + " " + mid + " " + min);
    }
}
