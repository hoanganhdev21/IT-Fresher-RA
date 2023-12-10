package Section10_Generic.RA_Exercise.Run;



import Section10_Generic.RA_Exercise.Entity.Categories;
import Section10_Generic.RA_Exercise.Entity.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ShopManagement {
    private static final ArrayList<Categories> categoriesList = new ArrayList<>();
    private static final ArrayList<Product> productList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("*************************SHOP MANAGEMENT***************");
            System.out.println("1. Quản lý danh mục sản phẩm");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Thoát");

            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    catalogManagement();
                    break;
                case 2:
                    productManagement();
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình");
                    System.exit(0);
                default:
                    System.out.println("Chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    private static void catalogManagement() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("***************** CATALOG MANAGEMENT**************");
            System.out.println("1. Thêm mới danh mục");
            System.out.println("2. Hiển thị thông tin các danh mục");
            System.out.println("3. Cập nhật tên danh mục theo mã danh mục");
            System.out.println("4. Xóa danh mục theo mã danh mục (Danh mục chưa chứa sản phẩm)");
            System.out.println("5. Thoát (Quay lại Shop Management)");

            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addNewCategory();
                    break;
                case 2:
                    displayCategories();
                    break;
                case 3:
                    updateCategoryName();
                    break;
                case 4:
                    deleteCategory();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    private static void addNewCategory() {
        Categories category = new Categories();
        category.inputData();
        categoriesList.add(category);
        System.out.println("Danh mục đã được thêm mới thành công.");
    }

    private static void displayCategories() {
        System.out.println("Thông tin các danh mục sản phẩm:");
        for (Categories category : categoriesList) {
            category.displayData();
            System.out.println("---------------------------");
        }
    }

    private static void updateCategoryName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã danh mục cần cập nhật: ");
        int categoryId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (Categories category : categoriesList) {
            if (category.getCatalogId() == categoryId) {
                System.out.print("Nhập tên mới cho danh mục: ");
                String newName = scanner.nextLine();
                category.setCatalogName(newName);
                System.out.println("Cập nhật thành công.");
                return;
            }
        }

        System.out.println("Không tìm thấy danh mục có mã " + categoryId);
    }

    private static void deleteCategory() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã danh mục cần xóa: ");
        int categoryId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (Categories category : categoriesList) {
            if (category.getCatalogId() == categoryId) {
                if (isCategoryEmpty(categoryId)) {
                    categoriesList.remove(category);
                    System.out.println("Xóa danh mục thành công.");
                } else {
                    System.out.println("Danh mục chưa chứa sản phẩm. Không thể xóa.");
                }
                return;
            }
        }

        System.out.println("Không tìm thấy danh mục có mã " + categoryId);
    }

    private static boolean isCategoryEmpty(int categoryId) {
        for (Product product : productList) {
            if (product.getCatalogId() == categoryId) {
                return false;
            }
        }
        return true;
    }

    private static void productManagement() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("***************** PRODUCT MANAGEMENT**************");
            System.out.println("1. Thêm mới sản phẩm (Khi thêm cho phép chọn danh mục sản phẩm mà sản phẩm thuộc về)");
            System.out.println("2. Hiển thị thông tin sản phẩm");
            System.out.println("3. Cập nhật giá sản phẩm theo mã sản phẩm");
            System.out.println("4. Xóa sản phẩm theo mã sản phẩm");
            System.out.println("5. Sắp xếp sản phẩm theo giá sản phẩm tăng dần");
            System.out.println("6. Sắp xếp sản phẩm theo tên tăng dần");
            System.out.println("7. Thống kê số lượng sản phẩm theo danh mục sản phẩm");
            System.out.println("8. Tìm kiếm sản phẩm theo tên sản phẩm");
            System.out.println("9. Thoát (Quay lại Shop Management)");

            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addNewProduct();
                    break;
                case 2:
                    displayProducts();
                    break;
                case 3:
                    updateProductPrice();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    sortByPrice();
                    break;
                case 6:
                    sortByName();
                    break;
                case 7:
                    countProductsByCategory();
                    break;
                case 8:
                    searchProductByName();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    private static void addNewProduct() {
        Product product = new Product();
        product.inputData();
        productList.add(product);
        System.out.println("Sản phẩm đã được thêm mới thành công.");
    }

    private static void displayProducts() {
        System.out.println("Thông tin sản phẩm:");
        for (Product product : productList) {
            product.displayData();
            System.out.println("---------------------------");
        }
    }

    private static void updateProductPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm cần cập nhật giá: ");
        String productId = scanner.nextLine();

        for (Product product : productList) {
            if (product.getProductId().equals(productId)) {
                System.out.print("Nhập giá mới cho sản phẩm: ");
                float newPrice = scanner.nextFloat();
                product.setPrice(newPrice);
                System.out.println("Cập nhật thành công.");
                return;
            }
        }

        System.out.println("Không tìm thấy sản phẩm có mã " + productId);
    }

    private static void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm cần xóa: ");
        String productId = scanner.nextLine();

        for (Product product : productList) {
            if (product.getProductId().equals(productId)) {
                productList.remove(product);
                System.out.println("Xóa sản phẩm thành công.");
                return;
            }
        }

        System.out.println("Không tìm thấy sản phẩm có mã " + productId);
    }

    private static void sortByPrice() {
        Collections.sort(productList, Comparator.comparing(Product::getPrice));
        System.out.println("Sắp xếp thành công theo giá tăng dần.");
    }

    private static void sortByName() {
        Collections.sort(productList, Comparator.comparing(Product::getProductName));
        System.out.println("Sắp xếp thành công theo tên tăng dần.");
    }

    private static void countProductsByCategory() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã danh mục cần thống kê: ");
        int categoryId = scanner.nextInt();

        int count = 0;
        for (Product product : productList) {
            if (product.getCatalogId() == categoryId) {
                count++;
            }
        }

        System.out.println("Số lượng sản phẩm thuộc danh mục có mã " + categoryId + " là: " + count);
    }

    private static void searchProductByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm cần tìm kiếm: ");
        String productName = scanner.nextLine();

        boolean found = false;
        for (Product product : productList) {
            if (product.getProductName().equalsIgnoreCase(productName)) {
                product.displayData();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sản phẩm có tên " + productName);
        }
    }


}



