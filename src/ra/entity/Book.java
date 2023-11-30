package ra.entity;

import java.util.Scanner;

public class Book {
    private String bookCode;
    private String bookName;
    private float importPrice;
    private float exportPrice;
    private String title;
    private String author;
    private String publisher;

    // Constructor không tham số
    public Book() {
    }

    // Constructor đầy đủ tham số
    public Book(String bookCode, String bookName, float importPrice, String title, String author, String publisher) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        calExportPrice(); // Gọi phương thức tính giá xuất khi khởi tạo
    }

    public void inputData(Scanner scanner) {
        // Thêm mã logic nhập liệu cho Book
        System.out.println("Nhập mã sách: ");
        this.bookCode = scanner.next();
        scanner.nextLine();
        System.out.println("Nhập tên sách: ");
        this.bookName = scanner.nextLine();
        System.out.println("Nhập giá nhập: ");
        this.importPrice = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Nhập tiêu đề: ");
        this.title = scanner.nextLine();
        System.out.println("Nhập tác giả: ");
        this.author = scanner.nextLine();
        System.out.println("Nhập nhà xuất bản: ");
        this.publisher = scanner.nextLine();
        calExportPrice(); // Tính giá xuất sau khi nhập liệu
    }

    public void displayData() {
        // Thêm mã logic hiển thị thông tin sách
        System.out.println("Mã sách: " + this.bookCode);
        System.out.println("Tên sách: " + this.bookName);
        System.out.println("Giá nhập: " + this.importPrice);
        System.out.println("Giá xuất: " + this.exportPrice);
        System.out.println("Tiêu đề: " + this.title);
        System.out.println("Tác giả: " + this.author);
        System.out.println("Nhà xuất bản: " + this.publisher);
    }

    public void calExportPrice() {
        this.exportPrice = this.exportPrice * 1.2F;
    }
}
