package Project_Module_1.Project_2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;


public class Library {
    private static List<Category> categories = new ArrayList<>();


    // ANSI escape codes for text color
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";


    private static List<Book> books = new ArrayList<>();
    public static void main(String[] args) {
        Library library = new Library();
        library.run();
    }

    Scanner scanner = new Scanner(System.in);

    public void run() {
        int choice;

        do {
            System.out.println("\nAhihi <<<<<<<<<< QUẢN LÝ THƯ VIỆN >>>>>>>>>> Ahihi");
            System.out.println("1. QUẢN LÝ THỂ LOẠI");
            System.out.println("2. QUẢN LÝ SÁCH");
            System.out.println("3. THOÁT");
            System.out.print("NHẬP LỰA CHỌN CỦA BẠN: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manageCategories();
                    break;
                case 2:
                    manageBooks();
                    break;
                case 3:
                    System.out.println("KẾT THÚC CHƯƠNG TRÌNH.");
                    break;
                default:
                    System.out.println("LỰA CHỌN KHÔNG HỢP LỆ. VUI LÒNG CHỌN LẠI!");
            }
        } while (choice != 3);
    }

    private void manageCategories() {
        int choice;
        do {
            System.out.println("\nAhihi <<<<<<<<<< QUẢN LÝ THỂ LOẠI >>>>>>>>>> Ahihi");
            System.out.println("1. Thêm mới thể loại");
            System.out.println("2. Hiển thị danh sách theo tên A – Z");
            System.out.println("3. Thống kê thể loại và số sách có trong mỗi thể loại");
            System.out.println("4. Cập nhật thể loại");
            System.out.println("5. Xóa thể loại");
            System.out.println("6. Quay lại");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Thêm mới thể loại
                    addNewCategory();
                    break;
                case 2:
                    // Hiển thị danh sách theo tên A – Z
                    viewCategoriesAZ();
                    break;
                case 3:
                    // Thống kê thể loại và số sách có trong mỗi thể loại
                    displayCategoryStatistics();
                    break;
                case 4:
                    // Cập nhật thể loại
                    updateCategory();
                    break;
                case 5:
                    // Xóa thể loại
                    deleteCategory();
                    break;
                case 6:
                    System.out.println("Quay lại menu Thư viện.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 6);
    }

    private void manageBooks() {
        int choice;
        do {
            System.out.println("\nAhihi <<<<<<<<<< QUẢN LÝ SÁCH >>>>>>>>>> Ahihi");
            System.out.println("1. THÊM MỚI SÁCH");
            System.out.println("2. CẬP NHẬT THÔNG TIN SÁCH");
            System.out.println("3. XOÁ SÁCH");
            System.out.println("4. TÌM KIẾM SÁCH");
            System.out.println("5. HIỂN THỊ DANH SÁCH SÁCH THEO NHÓM THỂ LOẠI");
            System.out.println("6. QUAY LẠI");
            System.out.print("NHẬP LỰA CHỌN CỦA BẠN: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Thêm mới sách
                    addNewBook();
                    break;
                case 2:
                    // Cập nhật thông tin sách
                    updateBook();
                    break;
                case 3:
                    // Xóa sách
                    deleteBook();
                    break;
                case 4:
                    // Tìm kiếm sách
                    searchBook();
                    break;
                case 5:
                    // Hiển thị danh sách sách theo nhóm thể loại
                    displayBooksByCategory();
                    break;
                case 6:
                    System.out.println("QUAY LẠI MENU THƯ VIỆN.");
                    break;
                default:
                    System.out.println("LỰA CHỌN KHÔNG HỢP LỆ. VUI LÒNG CHỌN LẠI!");
            }
        } while (choice != 6);
    }

    // CATEGORY
    // 1. Thêm mới thể loại.
    private static void addNewCategory() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("\n<<<<<<<<<<<<< THÊM MỚI THỂ LOẠI >>>>>>>>>>>>>");

            // Tạo đối tượng Category và nhập thông tin
            Category newCategory = new Category();
            newCategory.input();

            // Thêm vào danh sách thể loại
            categories.add(newCategory);

            // Lưu danh sách thể loại vào file categories.txt
            saveCategoriesToFile();

            System.out.println("THÊM MỚI THỂ LOẠI THÀNH CÔNG!");
        } catch (InputMismatchException e) {
            System.out.println("ERROR: ĐỊNH DẠNG ĐẦU VÀO KHÔNG HỢP LỆ.");
        }
    }

    private static void saveCategoriesToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("categories.txt"))) {
            for (Category category : categories) {
                writer.println(category.getId() + "," + category.getName() + "," + category.isStatus());
            }
        } catch (IOException e) {
            System.out.println("ERROR KHI LƯU FILE: " + e.getMessage());
        }
    }

    // 2. Hiển thị thông tin từ A - Z
    private static void viewCategoriesAZ() {
        try {
            System.out.println("\n>>>>>>>>>> DANH SÁCH THỂ LOẠI A-Z <<<<<<<<<<<\n");

            // Sắp xếp danh sách theo tên A-Z
            Collections.sort(categories, Comparator.comparing(Category::getName));

            // Hiển thị danh sách
            System.out.printf(YELLOW + (centerText("THÔNG TIN THỂ LOẠI SÁCH", 70) + RESET));
            System.out.println(RED + "\n+-----------------+--------------------------------+-----------------+" + RESET);

            // Hiển thị tiêu đề cột
            System.out.printf(GREEN + "| %-15s | %-30s | %-15s |\n" + RESET, centerText("Mã thể loại", 15), centerText("Tên thể loại", 30), centerText("Trạng thái", 15));
            System.out.println(RED +"+-----------------+--------------------------------+-----------------+"+ RESET);

            // Hiển thị từng dòng trong bảng
            for (Category category : categories) {
                System.out.printf("| %-15s | %-30s | %-15s |\n", centerText(String.valueOf(category.getId()), 15), centerText(category.getName(), 30), centerText((category.isStatus() ? "Hoạt động" : "Không hoạt động"), 15));
                System.out.println(RED +"+-----------------+--------------------------------+-----------------+"+ RESET);
            }
            // Lưu danh sách đã sắp xếp vào file categories.txt
            saveCategoriesAZToFile();

        } catch (InputMismatchException e) {
            System.out.println("ERROR: ĐỊNH DẠNG ĐẦU VÀO KHÔNG HỢP LỆ.");
        }
    }

    // Text center
    private static String centerText(String text, int width) {
        int padding = (width - text.length()) / 2;
        return String.format("%" + padding + "s%s%" + padding + "s", "", text, "");
    }

    private static void saveCategoriesAZToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("categories.txt"))) {
            for (Category category : categories) {
                writer.println(category.getId() + "," + category.getName() + "," + category.isStatus());
                System.out.println();
            }
            System.out.println("Danh sách thể loại đã được lưu vào file: " + "categories.txt");
        } catch (IOException e) {
            System.out.println("ERROR KHI LƯU FILE: " + e.getMessage());
        }
    }

    // 3. Thống kê thể loại va số sách có trong mỗi tể loại.
    private static void displayCategoryStatistics() {
        try {
            System.out.println("\n");
            System.out.printf(YELLOW + (centerText("THỐNG KÊ THỂ LOẠI", 40) + RESET));
            System.out.println(RED +"\n+----------------------+-----------------+"+ RESET);
            System.out.printf(GREEN + "| %-20s | %-15s |\n" + RESET, centerText("Thể loại", 20), centerText("Số sách", 15));
            System.out.println(RED +"+----------------------+-----------------+"+ RESET);

            // Sử dụng Map để theo dõi số sách cho mỗi thể loại
            Map<Integer, Integer> bookCountByCategory = new HashMap<>();
            for (Book book : books) {
                int categoryId = book.getCategoryId();
                bookCountByCategory.put(categoryId, bookCountByCategory.getOrDefault(categoryId, 0) + 1);
            }

            // Hiển thị thống kê
            for (Category category : categories) {
                int categoryId = category.getId();
                int bookCount = bookCountByCategory.getOrDefault(categoryId, 0);
//                System.out.println("Thể loại: " + category.getName() + ", Số sách: " + bookCount);
                System.out.printf("| %-20s | %-15d |\n", centerText((category.getName()), 20), bookCount);
                System.out.println(RED +"+----------------------+-----------------+"+ RESET);
            }

            // Lưu thống kê vào file category_statistics.txt
            saveCategoryStatisticsToFile(bookCountByCategory);

        } catch (InputMismatchException e) {
            System.out.println("ERROR: ĐỊNH DẠNG ĐẦU VÀO KHÔNG HỢP LỆ.");
        }
    }

    private static void saveCategoryStatisticsToFile(Map<Integer, Integer> bookCountByCategory) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("category_statistics.txt"))) {
            for (Map.Entry<Integer, Integer> entry : bookCountByCategory.entrySet()) {
                int categoryId = entry.getKey();
                int bookCount = entry.getValue();
                writer.println("Thể loại ID: " + categoryId + ", Số sách: " + bookCount);
            }
        } catch (IOException e) {
            System.out.println("ERROR KHI LƯU FILE: " + e.getMessage());
        }
    }

    // 4. Cập nhật thể loại.
    private static void updateCategory() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("\n<<<<<<<<<<<< CẬP NHẬT THỂ LOẠI >>>>>>>>>>>>");

            // Hiển thị danh sách thể loại để người dùng chọn
            displayCategoryStatistics();

            // Nhập mã thể loại cần cập nhật
            System.out.print("NHẬP MÃ THỂ LOAI CẦN CẬP NHẬT: ");
            int categoryIdToUpdate = scanner.nextInt();
            scanner.nextLine(); // Đọc kí tự mới dư sau khi nhập số nguyên

            // Tìm thể loại cần cập nhật
            Category categoryToUpdate = findCategoryById(categoryIdToUpdate);

            if (categoryToUpdate != null) {
                // Hiển thị thông tin thể loại cần cập nhật
                System.out.println("THÔNG TIN THỂ LOẠI CẦN CẬP NHẬT:");
                categoryToUpdate.output();

                // Nhập thông tin mới cho thể loại
                System.out.println("NHẬP THÔNG TIN MỚI:");
                categoryToUpdate.input();

                // Lưu danh sách thể loại vào file categories.txt sau khi cập nhật
                saveCategoriesToFile();

                // Thông báo cập nhật thành công
                System.out.println("Cập nhật thành công cho thể loại có mã " + categoryIdToUpdate);
            } else {
                System.out.println("KHÔNG TÌM THẤY THỂ LOẠI VỚI MÃ " + categoryIdToUpdate);
            }

        } catch (InputMismatchException e) {
            System.out.println("ERROR: ĐỊNH DẠNG ĐẦU VÀO KHÔNG HỢP LỆ.");
        }
    }

    private static Category findCategoryById(int categoryId) {
        for (Category category : categories) {
            if (category.getId() == categoryId) {
                return category;
            }
        }
        return null;
    }

    // 5. Xoá thể loại
    private static void deleteCategory() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("\n<<<<<<<<<<<<< XÓA THỂ LOẠI >>>>>>>>>>>>>");

            // Hiển thị danh sách thể loại để người dùng chọn
            displayCategoryStatistics();

            // Nhập mã thể loại cần xóa
            System.out.print("NHẬP MÃ THỂ LOẠI CẦN XOÁ: ");
            int categoryIdToDelete = scanner.nextInt();
            scanner.nextLine(); // Đọc kí tự mới dư sau khi nhập số nguyên

            // Tìm thể loại cần xóa
            Iterator<Category> iterator = categories.iterator();
            while (iterator.hasNext()) {
                Category category = iterator.next();
                if (category.getId() == categoryIdToDelete) {
                    // Xóa thể loại
                    iterator.remove();
                    System.out.println("ĐÃ XOÁ THỂ LOẠI CÓ MÃ " + categoryIdToDelete);

                    // Lưu danh sách thể loại vào file categories.txt sau khi xóa
                    saveCategoriesToFile();
                    return;
                }
            }

            System.out.println("KHÔNG TÌM THẤY THỂ LOẠI VỚI MÃ " + categoryIdToDelete);

        } catch (InputMismatchException e) {
            System.out.println("ERROR: ĐỊNH DẠNG ĐẦU VÀO KHÔNG HỢP LỆ.");
        }
    }

    // BOOK

    // 1. Thêm mới sách.
    private static void addNewBook() {
        try {
            System.out.println("\n<<<<<<<<<<<<<<<< THÊM MỚI SÁCH >>>>>>>>>>>>>>>>>>");

            // Hiển thị danh sách thể loại để người dùng chọn
            displayCategoryStatistics();

            // Nhập thông tin sách
            Book newBook = new Book();
            newBook.input();

            // Thêm vào danh sách sách
            books.add(newBook);

            // Lưu danh sách sách vào file books.txt
            saveBooksToFile();

            System.out.println("THÊM MỚI SÁCH THÀNH CÔNG!");

        } catch (InputMismatchException e) {
            System.out.println("ERROR: ĐỊNH DẠNG ĐẦU VÀO KHÔNG HỢP LỆ.");
        }
    }

    private static void saveBooksToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("books.txt"))) {
            for (Book book : books) {
                writer.println(book.getId() + "," + book.getTitle() + "," + book.getAuthor() + ","
                        + book.getPublisher() + "," + book.getYear() + "," + book.getDescription() + ","
                        + book.getCategoryId());
            }
        } catch (IOException e) {
            System.out.println("ERROR KHI LƯU FILE: " + e.getMessage());
        }
    }


    // 2. Cập nhật thông tin sách
    private static void updateBook() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("\n<<<<<<<<<<<<<<<< CẬP NHẬT THÔNG TIN SÁCH >>>>>>>>>>>>>>");

            // Hiển thị danh sách sách để người dùng chọn
            displayBooks();

            // Nhập mã sách cần cập nhật
            System.out.print("NHẬP MÃ SÁCH CẦN CẬP NHẬT: ");
            String bookIdToUpdate = scanner.nextLine();

            // Tìm sách cần cập nhật
            Iterator<Book> iterator = books.iterator();
            while (iterator.hasNext()) {
                Book book = iterator.next();
                if (book.getId().equals(bookIdToUpdate)) {
                    // Hiển thị thông tin sách cần cập nhật
                    System.out.println("THÔNG TIN SÁCH CẦN CẬP NHẬT:");
                    book.output();

                    // Nhập thông tin mới cho sách
                    System.out.println("NHẬP THÔNG TIN MỚI:");
                    book.input();

                    // Lưu danh sách sách vào file books.txt sau khi cập nhật
                    saveBooksToFile();
                    System.out.println("CẬP NHẬT THÔNG TIN SÁCH THÀNH CÔNG.");
                    return;
                }
            }

            System.out.println("KHÔNG TÌM THẤY SÁCH VỚI MÃ " + bookIdToUpdate);

        } catch (InputMismatchException e) {
            System.out.println("ERROR: ĐỊNH DẠNG ĐẦU VÀO KHÔNG HỢP LỆ.");
        }
    }

    // Hiển thị danh sách sách để người dùng chọn.
    private static void displayBooks() {
        System.out.println("\n");
        System.out.printf(YELLOW + (centerText("DANH SÁCH SÁCH", 120) + RESET));
        System.out.println(RED + "\n+----------------------+----------------------------------------------------+----------------------+----------------------+");
        System.out.printf(GREEN + "| %-20s | %-50s | %-20s | %-20s |\n" + RESET, centerText("Mã sách", 20), centerText("Tiêu đề sách", 50), centerText("Tác giả", 20), centerText("Nhà xuất bản", 20));
        System.out.println(RED + "+----------------------+----------------------------------------------------+----------------------+----------------------+" + RESET);

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.printf("| %-20s | %-50s | %-20s | %-20s |\n", centerText(book.getId(), 20), centerText(book.getTitle(), 50), centerText(book.getAuthor(), 20), centerText(book.getPublisher(), 20));
            System.out.println(RED + "+----------------------+----------------------------------------------------+----------------------+----------------------+\n" + RESET);
        }


    }

    // 3. Xoá sách.
    private static void deleteBook() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("\n<<<<<<<<<<<<<<<<<< XÓA SÁCH >>>>>>>>>>>>>>>>>>>");

            // Hiển thị danh sách sách để người dùng chọn
            displayBooks();

            // Nhập mã sách cần xóa
            System.out.print("NHẬP MÃ SÁCH CẦN XOÁ: ");
            String bookIdToDelete = scanner.nextLine();

            // Tìm sách cần xóa
            Iterator<Book> iterator = books.iterator();
            while (iterator.hasNext()) {
                Book book = iterator.next();
                if (book.getId().equals(bookIdToDelete)) {
                    // Hiển thị thông tin sách cần xóa
                    System.out.println("THÔNG TIN SÁCH CẦN XOÁ:");
                    book.output();

                    // Xác nhận xóa
                    System.out.print("BẠN CÓ CHẮC CHẮN MUỐN XOÁ SÁCH NÀY? (y/n): ");
                    String confirmDelete = scanner.nextLine().toLowerCase();

                    if (confirmDelete.equals("y")) {
                        // Thực hiện xóa sách khỏi danh sách
                        iterator.remove();

                        // Lưu danh sách sách vào file books.txt sau khi xóa
                        saveBooksToFile();
                        System.out.println("XOÁ SÁCH THÀNH CÔNG.");
                    } else {
                        System.out.println("HUỶ BỎ XOÁ SÁCH.");
                    }
                    displayBooks();
                    return;
                }
            }

            System.out.println("KHÔNG TÌM THẤY SÁCH VỚI MÃ " + bookIdToDelete);

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    // 4. Tìm kiếm sách.
    private static void searchBook() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("\n<<<<<<<<<<<<< TÌM KIẾM SÁCH >>>>>>>>>>>>>");

            // Nhập từ khóa tìm kiếm
            System.out.print("NHẬP TỪ KHOÁ TÌM KIẾM: ");
            String keyword = scanner.nextLine().toLowerCase();

            List<Book> resultBooks = new ArrayList<>();

            // Tìm kiếm sách theo từ khóa
            for (Book book : books) {
                if (bookContainsKeyword(book, keyword)) {
                    resultBooks.add(book);
                }
            }

            // Hiển thị kết quả tìm kiếm
            if (!resultBooks.isEmpty()) {
                System.out.println("KẾT QUẢ TÌM KIẾM:");
                displayBookList(resultBooks);
            } else {
                System.out.println("KHÔNG TÌM THẤY SÁCH VỚI TỪ KHOÁ \"" + keyword + "\"");
            }

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private static boolean bookContainsKeyword(Book book, String keyword) {
        // Kiểm tra xem thông tin sách có chứa từ khóa không
        return book.getTitle().toLowerCase().contains(keyword) ||
                book.getAuthor().toLowerCase().contains(keyword) ||
                book.getPublisher().toLowerCase().contains(keyword);
    }

    private static void displayBookList(List<Book> bookList) {
//        for (Book book : bookList) {
//            book.output();
//            System.out.println();
//
//        }
        System.out.printf(YELLOW + (centerText("SÁCH ĐƯỢC TÌM KIẾM", 120) + RESET));
        System.out.println(RED + "\n+----------------------+----------------------------------------------------+----------------------+----------------------+");
        System.out.printf(GREEN + "| %-20s | %-50s | %-20s | %-20s |\n" + RESET, centerText("Mã sách", 20), centerText("Tiêu đề sách", 50), centerText("Tác giả", 20), centerText("Nhà xuất bản", 20));
        System.out.println(RED + "+----------------------+----------------------------------------------------+----------------------+----------------------+" + RESET);

        for (Book book : bookList) {
            System.out.printf("| %-20s | %-50s | %-20s | %-20s |\n", centerText(book.getId(), 20), centerText(book.getTitle(), 50), centerText(book.getAuthor(), 20), centerText(book.getPublisher(), 20));
            System.out.println(RED + "+----------------------+----------------------------------------------------+----------------------+----------------------+" + RESET);
        }


    }

    // 5. Hiển thị danh sách theo nhóm thể loại.
    private static void displayBooksByCategory() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("\n<<<<<<<<<<<<<< HIỂN THỊ DANH SÁCH SÁCH THEO NHÓM THỂ LOẠI >>>>>>>>>>>>>>");

            // Hiển thị danh sách thể loại để người dùng chọn
            displayCategories();

            // Nhập mã thể loại cần hiển thị
            System.out.print("NHẬP MÃ THỂ LOẠI CẦN HIỂN THỊ SÁCH: ");
            int categoryIdToShow = scanner.nextInt();
            scanner.nextLine(); // Đọc kí tự mới dư sau khi nhập số nguyên

            // Tìm sách theo mã thể loại
            List<Book> booksInCategory = books.stream()
                    .filter(book -> book.getCategoryId() == categoryIdToShow)
                    .collect(Collectors.toList());

            // Hiển thị kết quả
            if (!booksInCategory.isEmpty()) {
                System.out.println("\n<<<<<<<<< DANH SÁCH SÁCH THUỘC THỂ LOẠI " + getCategoryName(categoryIdToShow) + " >>>>>>>>>");
                displayBookList(booksInCategory);
            } else {
                System.out.println("KHÔNG TÌM THẤY SÁCH THUỘC THỂ LOẠI CÓ MÃ " + categoryIdToShow);
            }

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private static void displayCategories() {
        // Hiển thị danh sách thể loại
        System.out.println("\n<<<<<<<<<< DANH SÁCH THỂ LOẠI >>>>>>>>>>");
        for (Category category : categories) {
            System.out.println(category.getId() + ": " + category.getName());
        }
    }

    private static String getCategoryName(int categoryId) {
        // Lấy tên thể loại dựa vào mã thể loại
        return categories.stream()
                .filter(category -> category.getId() == categoryId)
                .findFirst()
                .map(Category::getName)
                .orElse("KHÔNG XÁC ĐỊNH");
    }


}
