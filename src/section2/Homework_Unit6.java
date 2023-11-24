package section2;

import java.util.Scanner;
public class Homework_Unit6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int luaChon;

        do {
            hienThiMenu();
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    kiemTraChanLe();
                    break;
                case 2:
                    kiemTraSoNguyenTo();
                    break;
                case 3:
                    kiemTraChiaHetCho3();
                    break;
                case 0:
                    System.out.println("Ứng dụng kết thúc. Tạm biệt hẹn gặp lại!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                    break;
            }

        } while (luaChon != 0);

    }

    public static void hienThiMenu() {
        System.out.println("----- Menu -----");
        System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
        System.out.println("2. Kiểm tra số nguyên tố");
        System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
        System.out.println("0. Thoát");
        System.out.println("------------------------------------------");
    }

    public static void kiemTraChanLe() {

    }

    public static void kiemTraSoNguyenTo() {

    }

    public static void kiemTraChiaHetCho3() {

    }
}
