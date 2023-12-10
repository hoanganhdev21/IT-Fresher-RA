package Section6_Oops.RA.ShopCoffee.Entity;

import java.util.List;
import java.util.Scanner;

public class Categories {
    private int catelogId;
    private String catelogName;
    private String descriptions;
    private boolean catelogStatus;
    private List<Product> productList;

    public Categories() {
    }

    public Categories(int catelogId, String catelogName, String descriptions, boolean catelogStatus) {
        this.catelogId = catelogId;
        this.catelogName = catelogName;
        this.descriptions = descriptions;
        this.catelogStatus = catelogStatus;
    }

    public int getCatelogId() {
        return catelogId;
    }

    public void setCatelogId(int catelogId) {
        this.catelogId = catelogId;
    }

    public String getCatelogName() {
        return catelogName;
    }

    public void setCatelogName(String catelogName) {
        this.catelogName = catelogName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isCatelogStatus() {
        return catelogStatus;
    }

    public void setCatelogStatus(boolean catelogStatus) {
        this.catelogStatus = catelogStatus;
    }

    public void displayData() {
        System.out.printf("Mã danh mục: %d - Tên danh mục: %s\n" +
                "Mô tả danh mục: %s - Hoạt động: %s", this.catelogId, this.catelogName, this.descriptions, (this.catelogStatus ? "Hoạt động" : "Không hoạt động"));
    }

    public void inputData(Scanner scanner, Categories[] arrCategories, int currentIndex) {
        //mã danh mục tự tăng
        if (currentIndex == 0) {
            this.catelogId = 1;
        } else {
            int max = arrCategories[0].getCatelogId();
            for (int i = 0; i < currentIndex; i++) {
                if (max < arrCategories[i].getCatelogId()) {
                    max = arrCategories[i].getCatelogId();
                }
            }
            this.catelogId = max + 1;
        }
        //Nhập tên danh mục: tối đa 50 ký tự và không trùng lặp

        System.out.println("Nhập tên danh mục: ");
        this.catelogName = scanner.nextLine();
        if (this.catelogName.length() > 50) {
            System.out.println("Tên danh mục vượt quá 50 ký tự, vui lòng nhập tên ngắn hơn!");
        }
        System.out.println("Nhập mô tả danh mục: ");
        this.descriptions = scanner.nextLine();
        System.out.println("Nhập hoạt động: ");
        this.catelogStatus = Boolean.parseBoolean(scanner.nextLine());
    }

    public void updateData(Scanner scanner, Categories[] arrCategories) {
        System.out.println("Nhập mã danh mục bạn muốn cập nhật: ");
        int updateCateLogId = Integer.parseInt(scanner.nextLine());
        int indexToUpdate = findCatelog(updateCateLogId, arrCategories).getCatelogId();
        if (indexToUpdate == -1) {
            System.out.println("Danh mục không tìm thấy " + updateCateLogId);
            return;
        }
        System.out.println("\n- Thông tin cũ của danh mục: ");
        arrCategories[indexToUpdate].displayData();
        System.out.println("\n- Nhập thông tin mới: ");

        System.out.println("Nhập tên danh mục mới: ");
        String newName = scanner.nextLine();
        if (newName.length() > 50) {
            System.out.println("Tên danh mục vượt quá 50 ký tự, vui lòng nhập tên ngắn hơn!");
        }
        System.out.println("Nhập mô tả danh mục mới(giữ nguyên, nhấn Enter): ");
        String newDescriptions = scanner.nextLine();
        if (!newDescriptions.isEmpty()) {
            arrCategories[indexToUpdate].setDescriptions(newDescriptions);
        }
        System.out.println("Nhập trạng thái danh mục mới(true/false): ");
        boolean newCatelogStatus = Boolean.parseBoolean(scanner.nextLine());
        //cập nhật thông tin mới
        arrCategories[indexToUpdate].setCatelogName(newName);
        arrCategories[indexToUpdate].setDescriptions(newDescriptions);
        arrCategories[indexToUpdate].setCatelogStatus(newCatelogStatus);
        System.out.println("Thông tin đã được cập nhật:");
        arrCategories[indexToUpdate].displayData();
    }

    public void deleteData(Scanner scanner, Categories[] arrCategories, int catalogId) {
        System.out.println("Nhập mã danh mục bạn cần xóa: ");
        int newCatelogId = Integer.parseInt(scanner.nextLine());
        //Kiểm tra danh mục có chứa sản phẩm
        for (Product product : productList) {
            if (product.getCatalogId() == catalogId) {
                System.out.println("Không thể xóa danh mục vì chứa sản phẩm");
                return;
            }
        }
        //Xóa danh mục
    }

    //Phương thức tìm kiếm chỉ số của danh mục trên catalogId
    private static Categories findCatelog(int catelogId, Categories[] arrCategories) {
        for (Categories category : arrCategories) {
            if (category.getCatelogId() == catelogId) {
                return category;
            }
        }
        return null;
    }

    public void updateStatus(Scanner scanner, Categories[] arrCategories) {
        System.out.println("Nhập mã danh mục bạn muốn cập nhật: ");
        int updateCateLogId = Integer.parseInt(scanner.nextLine());
        int indexToUpdate = findCatelog(updateCateLogId, arrCategories).getCatelogId();
        System.out.println("Nhập trạng thái danh mục mới(true/false): ");
        boolean newCatelogStatus = Boolean.parseBoolean(scanner.nextLine());
        arrCategories[indexToUpdate].setCatelogStatus(newCatelogStatus);
    }

}
