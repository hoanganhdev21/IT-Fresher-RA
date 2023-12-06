package Section6_Oops.RA.Practice.entity;

import java.util.Scanner;

public class Book {
    private String bookId;
    private String bookName;
    private float importPrice;
    private float exportPrice;
    private String author;
    private float interest;
    private int year;

    // Constructors
    public Book() {
    }

    public Book(String bookId, String bookName, float importPrice, float exportPrice, String author, int year) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.year = year;
        this.interest = calculateInterest();
    }

    // Getters and Setters
    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
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
        this.interest = calculateInterest();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getInterest() {
        return interest;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Input and display book data method

    // Calculate interest method
    private float calculateInterest() {
        return exportPrice - importPrice;
    }

    // Method to input and display book data
    public void inputBookData() {
        // Input data from the user with validation
        // ...

        Scanner scanner = new Scanner(System.in);

        // Nhập bookId
        System.out.print("Nhập mã sách (không trùng lặp): ");
        this.bookId = scanner.nextLine();

        // Nhập bookName
        while (true) {
            System.out.print("Nhập tên sách (độ dài 4 ký tự, bắt đầu bằng B): ");
            this.bookName = scanner.nextLine();
            if (this.bookName.length() == 4 && this.bookName.startsWith("B")) {
                break;
            } else {
                System.out.println("Tên sách không hợp lệ. Vui lòng nhập lại.");
            }
        }

        // Nhập importPrice
        while (true) {
            System.out.print("Nhập giá nhập sách (lớn hơn 0): ");
            try {
                this.importPrice = Float.parseFloat(scanner.nextLine());
                if (this.importPrice > 0) {
                    break;
                } else {
                    System.out.println("Giá nhập sách không hợp lệ. Vui lòng nhập lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Giá nhập sách không hợp lệ. Vui lòng nhập lại.");
            }
        }

        // Nhập exportPrice
        while (true) {
            System.out.print("Nhập giá xuất sách (lớn hơn 30% giá nhập): ");
            try {
                this.exportPrice = Float.parseFloat(scanner.nextLine());
                if (this.exportPrice > 1.3 * this.importPrice) {
                    break;
                } else {
                    System.out.println("Giá xuất sách không hợp lệ. Vui lòng nhập lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Giá xuất sách không hợp lệ. Vui lòng nhập lại.");
            }
        }

        // Nhập author
        while (true) {
            System.out.print("Nhập tác giả sách (độ dài từ 6 đến 50 ký tự): ");
            this.author = scanner.nextLine();
            if (this.author.length() >= 6 && this.author.length() <= 50) {
                break;
            } else {
                System.out.println("Tên tác giả không hợp lệ. Vui lòng nhập lại.");
            }
        }

        // Nhập year
        while (true) {
            System.out.print("Nhập năm xuất bản (sau năm 2000): ");
            try {
                this.year = Integer.parseInt(scanner.nextLine());
                if (this.year > 2000) {
                    break;
                } else {
                    System.out.println("Năm xuất bản không hợp lệ. Vui lòng nhập lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Năm xuất bản không hợp lệ. Vui lòng nhập lại.");
            }
        }

//        // After input, calculate interest
//        this.calculateInterest();
    }

    public void displayBookInfo() {
        // Display book information
        // ...
    }

    public void displayBookData() {
        System.out.println("Book ID: " + this.bookId);
        System.out.println("Book Name: " + this.bookName);
        System.out.println("Import Price: " + this.importPrice);
        System.out.println("Export Price: " + this.exportPrice);
        System.out.println("Author: " + this.author);
        System.out.println("Interest: " + this.interest);
        System.out.println("Year: " + this.year);
    }

}