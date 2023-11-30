package Section3__Loops;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        //Nhap vao cac so nguyen va tinh tong, ket thuc khi nhap 0
        Scanner scanner = new Scanner(System.in);
        int a = 1;
        int sum = 0;
        while (a != 0) {
            System.out.println("Nhap vao mot so:");
            a = Integer.parseInt(scanner.nextLine());
            sum += a;
        }
        System.out.println("Tong cac so vua nhap: " + sum);
        //Su dung vong while khi chua biet truoc so lan lap
        //Su dung vong while nhap vao cac so va tinh tong cac so chan, ket thuc khi nhap 0
        int sumEvent = 0;
        int number = 1;
        while (number != 0) {
            System.out.println("Nhap vao mot so:");
            number = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0) {
                sumEvent += number;
            }
        }
        System.out.println("Tong cac so chan vua nhap: "+sumEvent);
    }
}
