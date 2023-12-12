package Section11_ExceptionAndFile.RA_Exercise.Imp;

import Section11_ExceptionAndFile.RA_Exercise.IBook;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Book implements IBook {
    private int bookId;
    private String bookName;
    private float importPrice;
    private float exportPrice;
    private String author;
    private Date created;
    private String descriptions;

    private static int maxId = 0;

    public Book() {
        this.bookId = ++maxId;
    }

    public Book(int bookId, String bookName, float importPrice, float exportPrice, String author, Date created, String descriptions) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.created = created;
        this.descriptions = descriptions;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public static int getMaxId() {
        return maxId;
    }

    public static void setMaxId(int maxId) {
        Book.maxId = maxId;
    }

    @Override
    public void inputData(Scanner scanner) throws Exception {
        // Triển khai phương thức nhập thông tin từ bàn phím
        System.out.println("Nhập mã sách: ");
        this.bookId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nhập tên sách: ");
        this.bookName = scanner.nextLine();

        System.out.println("Nhập giá nhập: ");
        this.importPrice = scanner.nextFloat();

        System.out.println("Nhập giá xuất: ");
        this.exportPrice = scanner.nextFloat();

        System.out.println("Nhập tác giả: ");
        this.author = scanner.nextLine();

        System.out.println("Nhập ngày tạo: ");
        String createdStr = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.created = sdf.parse(createdStr);
        } catch (ParseException e) {
            System.out.println("Ngày tạo không đúng định dạng");
        }

        System.out.println("Nhập mô tả: ");
        this.descriptions = scanner.nextLine();

        // Validate
        if (this.bookName.length() < 4 || this.bookName.length() > 10) {
            throw new Exception("Tên sách phải có từ 4 đến 10 ký tự");
        }

        if (this.bookName.charAt(0) != 'B') {
            throw new Exception("Tên sách phải bắt đầu bằng chữ B");
        }

        if (this.importPrice <= 0) {
            throw new Exception("Giá nhập phải lớn hơn 0");
        }

        if (this.exportPrice <= 0) {
            throw new Exception("Giá xuất phải lớn hơn 0");
        }

        if (this.exportPrice <= this.importPrice) {
            throw new Exception("Giá xuất phải lớn hơn giá nhập");
        }

        if (this.author.length() < 6 || this.author.length() > 50) {
            throw new Exception("Tên tác giả phải có từ 6 đến 50 ký tự");
        }
    }

    @Override
    public void inputData() {

    }


    @Override
    public void displayData() {
        // Triển khai phương thức hiển thị thông tin
        System.out.println("Book Information:");
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Import Price: " + importPrice);
        System.out.println("Export Price: " + exportPrice);
        System.out.println("Author: " + author);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Created: " + dateFormat.format(created));

        System.out.println("Descriptions: " + descriptions);
    }
}
