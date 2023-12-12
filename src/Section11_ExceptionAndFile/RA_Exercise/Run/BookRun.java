package Section11_ExceptionAndFile.RA_Exercise.Run;

import Section11_ExceptionAndFile.RA_Exercise.Imp.Book;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookRun {
    private static final String FILE_PATH = "books.txt";
    private ArrayList<Book> books = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        BookRun bookRun = new BookRun();
        bookRun.loadDataFromFile();
        bookRun.runMenu();
        bookRun.saveDataToFile();
    }

    private void loadDataFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Parse and create Book objects from file data
                // Add the created Book object to the 'books' list
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveDataToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Book book : books) {
                // Write book information to the file
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void runMenu() {
        int choice;
        do {
            // Hiển thị menu
            System.out.println("*********************************MENU********************************");
            System.out.println("1. Nhập thông tin sách");
            System.out.println("2. Hiển thị thông tin sách");
            System.out.println("3. Cập nhật thông tin sách theo mã sách");
            System.out.println("4. Xóa sách theo mã sách");
            System.out.println("5. Sắp xếp sách theo giá bán tăng dần");
            System.out.println("6. Thống kê sách theo khoảng giá (a-b nhập từ bàn phím)");
            System.out.println("7. Tìm kiếm sách theo tên tác giả");
            System.out.println("8. Thoát");

            // Nhập lựa chọn từ người dùng
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Nhập thông tin sách
                    break;
                case 2:
                    // Hiển thị thông tin sách
                    break;
                case 3:
                    // Cập nhật thông tin sách theo mã sách
                    break;
                case 4:
                    // Xóa sách theo mã sách
                    break;
                case 5:
                    // Sắp xếp sách theo giá bán tăng dần
                    break;
                case 6:
                    // Thống kê sách theo khoảng giá
                    break;
                case 7:
                    // Tìm kiếm sách theo tên tác giả
                    break;
                case 8:
                    // Thoát chương trình và lưu dữ liệu vào file
                    saveBooksToFile();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        } while (choice != 8);

    }

    private void saveBooksToFile() {
    }
}
