package Section6_Oops.RA.Practice.run;

import Section6_Oops.RA.Practice.entity.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BookImp {
    private static ArrayList<Book> books = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("*********************MENU******************");
            System.out.println("1. Nhập thông tin n sách");
            System.out.println("2. Tính lợi nhuận các sách");
            System.out.println("3. Hiển thị thông tin sách");
            System.out.println("4. Sắp xếp sách theo giá bán tăng dần");
            System.out.println("5. Sắp xếp sách theo lợi nhuận giảm dần");
            System.out.println("6. Tìm sách theo tên sách");
            System.out.println("7. Thống kê số lượng sách theo năm xuất bản");
            System.out.println("8. Thống kê số lượng sách theo tác giả");
            System.out.println("9. Thoát");

            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inputBooks();
                    break;
                case 2:
                    calculateProfits();
                    break;
                case 3:
                    displayBookInformation();
                    break;
                case 4:
                    sortBooksBySellingPriceAscending();
                    break;
                case 5:
                    sortBooksByProfitDescending();
                    break;
                case 6:
                    searchBookByName();
                    break;
                case 7:
//                    countBooksByYear();
                    break;
                case 8:
//                    countBooksByAuthor();
                    break;
            }
        } while (choice != 9);
    }

    private static void inputBooks() {
        System.out.print("Nhập số lượng sách: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            Book book = new Book();
            book.inputBookData();
            books.add(book);
        }
    }

    private static void calculateProfits() {
        for (Book book : books) {
            // Calculate profits for each book
        }
        System.out.println("Đã tính lợi nhuận cho các sách.");
    }

    private static void displayBookInformation() {
        for (Book book : books) {
            book.displayBookData();
        }
    }

    private static void sortBooksBySellingPriceAscending() {
        Collections.sort(books, Comparator.comparing(Book::getExportPrice));
        System.out.println("Đã sắp xếp sách theo giá bán tăng dần.");
    }

    private static void sortBooksByProfitDescending() {
        Collections.sort(books, Comparator.comparing(Book::getInterest).reversed());
        System.out.println("Đã sắp xếp sách theo lợi nhuận giảm dần.");
    }
    private static void searchBookByName() {
        System.out.print("Nhập tên sách cần tìm: ");
        String name = scanner.next();

        for (Book book : books) {
            if (book.getBookName().equals(name)) {
                book.displayBookData();
                return;
            }
        }

        System.out.println("Không tìm thấy sách có tên: " + name);
    }
}

