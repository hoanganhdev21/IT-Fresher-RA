package Project_Module_1.Project_1;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Book implements IEntity {
    private String id;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private String description;
    private int categoryId;

    private static List<String> existingBookIds = new ArrayList<>();
    private static List<String> existingBookTitles = new ArrayList<>();
    private static List<Integer> validCategoryIds = new ArrayList<>();

    // Constructors

    public Book() {

    }

    public Book(String id, String title, String author, String publisher, int year, String description, int categoryId) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.description = description;
        this.categoryId = categoryId;
    }

    // getters, setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        // Nhập thông tin Book và validate

        // Nhập mã sách
        System.out.print("NHẬP MÃ SÁCH (BẮT ĐẦU BẰNG \"B\", ĐỘ DÀI 4 KÍ TỰ): ");
        while (true) {
            try {
                String inputId = scanner.nextLine().trim();
                if (isValidBookId(inputId)) {
                    id = inputId;
                    break;
                } else {
                    System.out.print("MÃ SÁCH KHÔNG HỢP LỆ. VUI LÒNG NHẬP LẠI: ");
                }
            } catch (InputMismatchException e) {
                System.out.print("LỖI: ĐỊNH DẠNG ĐẦU VÀO KHÔNG HỢP LỆ. VUI LÒNG NHẬP LẠI: ");
                scanner.nextLine();  // Đọc và loại bỏ dữ liệu không hợp lệ
            }
        }

        // Nhập tiêu đề sách
        System.out.print("NHẬP TIÊU ĐỀ SÁCH (TỪ 6-50 KÍ TỰ): ");
        title = scanner.nextLine();
        while (!isValidTitle(title)) {
            System.out.print("TIÊU ĐỀ SÁCH KHÔNG HỢP LỆ. VUI LÒNG NHẬP LẠI: ");
            title = scanner.nextLine();
        }

        // Nhập tên tác giả
        System.out.print("NHẬP TÊN TÁC GIẢ: ");
        author = scanner.nextLine();
        while (author.trim().isEmpty()) {
            System.out.print("TÊN TÁC GIẢ KHÔNG ĐƯỢC ĐỂ TRỐNG. VUI LÒNG NHẬP LẠI: ");
            author = scanner.nextLine();
        }

        // Nhập nhà xuất bản
        System.out.print("NHẬP NHÀ XUẤT BẢN: ");
        publisher = scanner.nextLine();
        while (publisher.trim().isEmpty()) {
            System.out.print("NHÀ XUẤT BẢN KHÔNG ĐƯỢC ĐỂ TRỐNG. VUI LÒNG NHẬP LẠI: ");
            publisher = scanner.nextLine();
        }

        // Nhập năm xuất bản
        System.out.print("NHẬP NĂM XUẤT BẢN (TỐI THIỂU TỪ NĂM 1970 VÀ KHÔNG LỚN HƠN NĂM HIỆN TẠI):  ");
        while (true) {
            try {
                year = scanner.nextInt();
                if (isValidYear(year)) {
                    break;
                } else {
                    System.out.print("NĂM XUẤT BẢN KHÔNG HỢP LỆ. VUI LÒNG NHẬP LẠI: ");
                }
            } catch (InputMismatchException e) {
                System.out.print("LỖI: ĐỊNH DẠNG ĐẦU VÀO KHÔNG HỢP LỆ. VUI LÒNG NHẬP LẠI: ");
                scanner.nextLine();  // Đọc và loại bỏ dữ liệu không hợp lệ
            }
        }
        scanner.nextLine(); // Loại bỏ dòng mới

        // Nhập mô tả sách
        System.out.print("NHẬP MÔ TẢ SÁCH: ");
        description = scanner.nextLine();
        while (description.trim().isEmpty()) {
            System.out.print("MÔ TẢ SÁCH KHÔNG ĐƯỢC ĐỂ TRỐNG. VUI LÒNG NHẬP LẠI: ");
            description = scanner.nextLine();
        }

        // Nhập mã thể loại sách
        System.out.print("NHẬP MÃ THỂ LOẠI SÁCH: ");
        while (true) {
            try {
                categoryId = scanner.nextInt();

                // Thực hiện kiểm tra hợp lệ cho categoryId
                if (isValidCategoryId(categoryId)) {
                    break;
                } else {
                    System.out.print("MÃ THỂ LOẠI SÁCH KHÔNG HỢP LỆ. VUI LÒNG NHẬP LẠI: ");
                }
            } catch (InputMismatchException e) {
                System.out.print("LỖI: ĐỊNH DẠNG ĐẦU VÀO KHÔNG HỢP LỆ. VUI LÒNG NHẬP LẠI: ");
                scanner.nextLine();  // Đọc và loại bỏ dữ liệu không hợp lệ
            }
        }
        scanner.nextLine(); // Loại bỏ dòng mới
    }

    // Các phương thức kiểm tra hợp lệ
    private boolean isValidBookId(String id) {
        // Thực hiện kiểm tra hợp lệ cho mã sách
        return id.matches("^B\\d{3}$");
    }

    private boolean isValidTitle(String title) {
        // Thực hiện kiểm tra hợp lệ cho tiêu đề sách
        return title.length() >= 6 && title.length() <= 50;
    }

    private boolean isValidYear(int year) {
        // Thực hiện kiểm tra hợp lệ cho năm xuất bản
        int currentYear = java.time.Year.now().getValue();
        return year >= 1970 && year <= currentYear;
    }

    private boolean isValidCategoryId(int categoryId) {
        // Thực hiện kiểm tra hợp lệ cho categoryId
        List<Integer> validCategoryIds = getCategoryIdsFromDatabaseOrFile();
        return validCategoryIds.contains(categoryId);
    }

    // Phương thức lấy danh sách mã thể loại từ file
    private List<Integer> getCategoryIdsFromDatabaseOrFile() {
        // Trả về danh sách các mã thể loại (đây chỉ là ví dụ)
        return List.of(1, 2, 3, 4, 5);
    }

    @Override
    public void output() {
        // Hiển thị thông tin Book
        System.out.println("<<<<<<<<<<<<<<<<< THÔNG TIN SÁCH >>>>>>>>>>>>>>>>>");
        System.out.println("MÃ SÁCH: " + id);
        System.out.println("TIÊU ĐỀ SÁCH: " + title);
        System.out.println("TÁC GIẢ: " + author);
        System.out.println("NHÀ XUẤT BẢN: " + publisher);
        System.out.println("NĂM XUẤT BẢN: " + year);
        System.out.println("MÔ TẢ SÁCH: " + description);
        System.out.println("MÃ THỂ LOẠI SÁCH: " + categoryId);

    }
}