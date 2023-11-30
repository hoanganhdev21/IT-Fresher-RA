package Section3__Loops;

import java.util.Scanner;

public class Loop_for {


    // In menu và thực hiện các chức năng theo menu sau
    //        // 1. Nhập vào một số nguyên
    //        // 2. In ra các số chăn từ 1 - n
    //        // 3. Kiểm tra n có phải là số nguyên t không
    //        // 4. Kiểm tra N có phải là số hoàn hảo không
    //        // 5. Thoát
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opt;
        int n = 0;

        do {
            System.out.println("<<<<<<<<<<<<<<< MENU >>>>>>>>>>>>>>>>>>");
            System.out.println("1. Nhập vào một số nguyên");
            System.out.println("2. In ra các số chẵn từ 1 đến n");
            System.out.println("3. Kiểm tra n có phải là số nguyên tố không");
            System.out.println("4. Kiểm tra n có phải là số hoàn hảo không");
            System.out.println("5. Thoát");

            System.out.print("Chọn chức năng 1 >>> 5: ");
            opt = scanner.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("Nhập vào một số nguyên: ");
                    n = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Các số chẵn từ 1 đến " + n + ":");
                    for (int i = 2; i <= n; i += 2) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    boolean isPrime = true;
                    if (n < 2) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i <= Math.sqrt(n); i++) {
                            if (n % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }
                    System.out.println(n + " là số nguyên tố: " + isPrime);
                    break;
                case 4:
                    boolean isPerfect = false;
                    if (n > 0) {
                        int sum = 1;
                        for (int i = 2; i <= Math.sqrt(n); i++) {
                            if (n % i == 0) {
                                sum += i;
                                if (i != n / i) {
                                    sum += n / i;
                                }
                            }
                        }
                        isPerfect = (sum == n);
                    }
                    System.out.println(n + " là số hoàn hảo: " + isPerfect);
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }

        } while (opt != 5);

    }
}

