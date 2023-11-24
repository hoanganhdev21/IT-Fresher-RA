package section2;

import java.util.Scanner;

public class if_elseif_else {
    public static void main(String[] args) {
        // 1. Nập vào 1 số kiểm tra có phải số chẵn không.
        Scanner scanner = new Scanner(System.in);
       // System.out.printf("Nhập vào số nguyên:");
        //int number = scanner.nextInt();
        /*if (number %2 == 0){
            System.out.printf("%d Là sỗ chẵn\n", number);
        }else{
            System.out.printf("%d Là sỗ chẵn\n", number);
        }*/

        // 2. In ra số dư trong phép chia 3
        /*if (number %3==0){
            System.out.printf("%d Là sỗ chia hết cho 3\n", number);
        } else if (number %3==1) {
            System.out.printf("%d Là sỗ chia hết cho 3 dư 1 \n", number);
        }else {
            System.out.printf("%d Là sỗ chia hết cho 3 dư 2\n", number);
        }*/

        // 3. Sử dụng if else if và else in ra số dư trong phép chia 5
        /*if (number % 5 == 0){
            System.out.printf("%d La so chia het cho 5 \n", number);
        }else if (number % 5 == 1) {
            System.out.printf("%d Là sỗ chia hết cho 5 dư 1 \n", number);
        } else if (number % 5 == 2) {
            System.out.printf("%d La so chia het cho 5 dư 2 \n", number);
        } else if (number % 5 == 3) {
            System.out.printf("%d La so chia het cho 5 dư 3 \n", number);
        }else{
            System.out.printf("%d La so chia het cho 5 dư 4 \n", number);
        }*/

        // 4. Tính tiền vé xe bus
        // Giá vé xe bus niêm yết
        int giaVe = 7000;

        // Nhập tuổi
        System.out.print("Nhập tuổi của hành khách: ");
        int age = scanner.nextInt();
        // Tính vé
        float price;
        if (age < 6 && age < 60){
            price = 0;
        } else if (age >= 6 && age < 18) {
            price = 7000 * 0.5F;
        } else{
            price = 7000;
        }
        System.out.printf("%d Vé xe bus:\n", price);

    }
}
