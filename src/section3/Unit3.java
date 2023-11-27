package section3;

import java.util.Scanner;

public class Unit3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opt;

//        Dung do while de in vo han
        do {
            System.out.println("<<<<<<<<<<<<<<<<<<<< BREACKFAST MENU >>>>>>>>>>>>>>>>>>>>");
            System.out.println("1. Phở tôm hùm");
            System.out.println("2. Phở bò Kobe");
            System.out.println("3. Phở gà Việt Nam");
            System.out.println("4. Xôi trứng thịt");
            System.out.println("5. Bánh mỳ trứng");
            System.out.println("6. Mỳ tôm không người lái");
            System.out.println("7. Thoát");
            System.out.println("Lựa chọn của bạn:");
            opt = scanner.nextInt();
            if (opt < 1 || opt > 7) {
                System.out.println("Vui lòng chọn từ 1 - 7");
            } else if (opt != 7) {
                System.out.println("Bạn vừa chọn món " + opt + ", vui lòng đợi trong giây lát <3 !");
            }
        } while (true);
    }
}
