package section3;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        /*
        In menu sau:
        *******MENU***********
        1. Pho bo kobe
        2. Pho ga Viet Nam
        3. Xoi trung thit
        4. My tom khong nguoi lai
        5. Thoat
        Lua chon cua ban:
        * */
        Scanner scanner = new Scanner(System.in);
        //Dung do...while de in menu vo han
        do {
            System.out.println("********MENU**********");
            System.out.println("1. Pho bo kobe");
            System.out.println("2. Pho ga Viet Nam");
            System.out.println("3. Xoi trung thit");
            System.out.println("4. My tom khong nguoi lai");
            System.out.println("5. Thoat");
            System.out.println("Su lua chon cua ban:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Ban vua chon pho bo kobe");
                    break;
                case 2:
                    System.out.println("Ban vua chon pho ga Viet Nam");
                    break;
                case 3:
                    System.out.println("Ban vua chon xoi trung thit");
                    break;
                case 4:
                    System.out.println("Ban vua chon my tom khong nguoi lai");
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.err.println("Vui long chon tu 1-5");
            }
        } while (true);
    }
}

