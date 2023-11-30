package Section3__Loops;

import java.util.Scanner;

public class ExerciseDemo {
    public static void main(String[] args) {
        /*
         * In menu va thuc hien cac chuc nang theo menu sau:
         * *****************MENU*********************
         * 1. Nhap vao 1 so nguyen (n)
         * 2. In ra cac so chan tu 1 - n va tinh tong
         * 3. Kiem tra n co phai so nguyen to khong
         * 4. Kiem tra n co phai so hoan hao khong
         * 5. Thoat
         * */
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum;
        do {
            System.out.println("**********MENU**************");
            System.out.println("1. Nhap so nguyen");
            System.out.println("2. In ra cac so chan trong 1-n va tinh tong");
            System.out.println("3. Kiem tra so nguyen to");
            System.out.println("4. Kiem tra so hoan hao");
            System.out.println("5. Thoat");
            System.out.print("Lua chon cua ban: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhap vao so nguyen:");
                    number = Integer.parseInt(scanner.nextLine());
                    break;
                case 2:
                    sum = 0;
                    System.out.printf("Cac so chan trong khoang 1-%d la:\n", number);
                    for (int i = 1; i <= number; i++) {
                        if (i % 2 == 0) {
                            System.out.printf("%d\t", i);
                            sum += i;
                        }
                    }
                    System.out.printf("\nTong cac so chan trong khoang 1-%d la: %d\n", number, sum);
                    break;
                case 3:
                    boolean isPrime = true;//So nguyen to
                    if (number >= 2) {
                        for (int i = 2; i <= Math.sqrt(number); i++) {
                            if (number % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    } else {
                        isPrime = false;
                    }
                    if (isPrime) {
                        System.out.printf("%d la so nguyen to\n", number);
                    } else {
                        System.out.printf("%d khong phai la so nguyen to\n", number);
                    }
                    break;
                case 4:
                    sum = 0;
                    for (int i = 1; i < number; i++) {
                        if (number % i == 0) {
                            sum += i;
                        }
                    }
                    if (sum == number) {
                        System.out.printf("%d la so hoan hao\n", number);
                    } else {
                        System.out.printf("%d khong phai la so hoan hao\n", number);
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.err.println("Vui long chon 1-5");
            }
        } while (true);
    }
}
