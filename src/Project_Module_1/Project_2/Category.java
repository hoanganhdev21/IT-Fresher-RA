package Project_Module_1.Project_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Category implements IEntity {
    Scanner scanner = new Scanner(System.in);
    private int id;
    private String name;
    private boolean status;
    private static List<Integer> existingCategoryIds = new ArrayList<>();
    private static List<String> existingCategoryNames = new ArrayList<>();

    // ANSI escape codes for text color
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";

    // Constructors
    public Category(){

    }
    public Category(int id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    // Getter, Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void input() {
        // Nhập thông tin Category và validate
        // Nhập mã thể loại
        System.out.print("Nhập mã thể loại (số nguyên lớn hơn 0, duy nhất): ");
        id = scanner.nextInt();
        while (id <= 0 || !isUniqueCategoryId(id)) {
            System.out.println("Mã thể loại không hợp lệ hoặc đã tồn tại. Vui lòng nhập lại.");
            System.out.print("Nhập mã thể loại (số nguyên lớn hơn 0, duy nhất): ");
            id = scanner.nextInt();
        }
        existingCategoryIds.add(id); // Thêm id mới vào danh sách

        // Nhập tên thể loại
        scanner.nextLine(); // Đọc kí tự mới dư sau khi nhập số nguyên
        System.out.print("Nhập tên thể loại (từ 6-30 kí tự): ");
        name = scanner.nextLine().trim();
        while (name.length() < 6 || name.length() > 30 || !isUniqueCategoryName(name)) {
            System.out.println("Tên thể loại không hợp lệ hoặc đã tồn tại. Vui lòng nhập lại.");
            System.out.print("Nhập tên thể loại (từ 6-30 kí tự): ");
            name = scanner.nextLine().trim();
        }
        existingCategoryNames.add(name); // Thêm name mới vào danh sách

        // Nhập trạng thái thể loại
        System.out.print("Nhập trạng thái thể loại (true/false): ");
        status = scanner.nextBoolean();

    }

    private boolean isUniqueCategoryId(int categoryId) {
        // Kiểm tra xem categoryId có là duy nhất không
        return !existingCategoryIds.contains(categoryId);
    }

    private boolean isUniqueCategoryName(String categoryName) {
        // Kiểm tra xem categoryName có là duy nhất không
        return !existingCategoryNames.contains(categoryName);
    }

    @Override
    public void output() {
        // Hiển thị thông tin Category
        System.out.println("<<<<<<<<<<<<<<<< THÔNG TIN THỂ LOẠI SÁCH >>>>>>>>>>>>>>>>");
        System.out.println("Mã thể loại: " + id);
        System.out.println("Tên thể loại: " + name);
        System.out.println("Trạng thái: " + (status ? "Hoạt động" : "Không hoạt động"));
        System.out.println("*********************************************************");
//        System.out.printf(centerText("THÔNG TIN THỂ LOẠI SÁCH", 70));
//        System.out.println("\n+--------------------------------------------------------------------+");
//        // Display table content
//        System.out.printf("| %-15s | %-30s | %-15s |\n", centerText("Mã thể loại" , 15), centerText("Tên thể loại", 30), centerText("Trạng thái", 15));
//        System.out.println("+--------------------------------------------------------------------+");
//        // Display data row
//        System.out.printf("| %-15s | %-30s | %-15s |\n", centerText(String.valueOf(id), 15), centerText(name, 30), centerText((status ? "Hoạt động" : "Không hoạt động"), 15));
//        System.out.println("+--------------------------------------------------------------------+");
    }
}
