package input_output;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        //1. Nhập vào mã sinh viên
        //B1: Khởi tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);
        //B2: Thông báo nhập
        System.out.println("Nhập vào mã sinh viên:");
        //B3: Sử dụng phương thức của scanner lấy giá trị nhập gán vào biến
        int studentId = Integer.parseInt(scanner.nextLine());
        //2. Nhập vào tên sinh viên
        System.out.println("Nhập vào tên sinh viên:");
        String studentName = scanner.nextLine();
        //3. Nhập vào tuổi sinh viên
        System.out.println("Nhập vào tuổi sinh viên:");
        int age = Integer.parseInt(scanner.nextLine());
        //4. Nhập vào địa chỉ sinh viên
        System.out.println("Nhập vào địa chỉ sinh viên:");
        String address = scanner.nextLine();

        //In thông tin sinh viên:
        System.out.println("Mã sinh viên: "+studentId);
        System.out.println("Tên sinh viên: "+studentName);
        System.out.println("Tuổi: "+age);
        System.out.println("Địa chỉ: "+address);

        /*
        Nhập thông tin sách gồm các thông tin sau:
        1. Mã sách - String
        2. Tên sách - String
        3. Giá sách - float
        4. Tác giả - String
        5. Nhà xuất bản - String
        6. Trạng thái sách - boolean
        In thông tin sách theo định dạng sau: - printf
        Mã sách: S001 - Tên sách: Văn học - Tác giả: Nguyễn Văn A
        Giá sách: 78000 - Nhà xuất bản: Kim Đồng - Trạng thái sách: true
        * */

        // Giải đề bài trên
        /*
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin sách
        System.out.print("Nhập mã sách: ");
        String maSach = scanner.nextLine();

        System.out.print("Nhập tên sách: ");
        String tenSach = scanner.nextLine();

        System.out.print("Nhập giá sách: ");
        float giaSach = Float.parseFloat(scanner.nextLine());

        System.out.print("Nhập tác giả: ");
        String tacGia = scanner.nextLine();

        System.out.print("Nhập nhà xuất bản: ");
        String nhaXuatBan = scanner.nextLine();

        System.out.print("Nhập trạng thái sách (true/false): ");
        boolean trangThaiSach = Boolean.parseBoolean(scanner.nextLine());

        // Hiển thị thông tin sách
        System.out.printf("Mã sách: %s - Tên sách: %s - Tác giả: %s\n", maSach, tenSach, tacGia);
        System.out.printf("Giá sách: %.2f - Nhà xuất bản: %s - Trạng thái sách: %b\n", giaSach, nhaXuatBan, trangThaiSach); */

    }
}
