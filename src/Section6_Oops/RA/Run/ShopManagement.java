package Section6_Oops.RA.Run;
import Section6_Oops.RA.Entity.Categories;
import Section6_Oops.RA.Entity.Product;
import java.util.Scanner;
public class ShopManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo đối tượng main
        Categories[] arrCategories = new Categories[100];
        Product[] arrProduct = new Product[100];

        int choice;

        // In MENU
        do {
            System.out.println("******************SHOP MENU*******************");
            System.out.println("1. Quản lý danh mục sản phẩm");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Thoát");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    categoriesMenu(scanner, arrCategories);
                    break;
                case 2:
                    productMenu(scanner, arrProduct, arrCategories);
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 3);

        scanner.close();
    }

    private static void categoriesMenu(Scanner scanner, Categories[] arrCategories) {
        int choice;
        do {
            System.out.println("********************CATEGORIES MENU***********");
            System.out.println("1. Nhập thông tin các danh mục");
            System.out.println("2. Hiển thị thông tin các danh mục");
            System.out.println("3. Cập nhật thông tin danh mục");
            System.out.println("4. Xóa danh mục");
            System.out.println("5. Cập nhật trạng thái danh mục");
            System.out.println("6. Thoát");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Nhập thông tin danh mục
                    break;
                case 2:
                    // Hiển thị thông tin danh mục
                    break;
                case 3:
                    // Cập nhật thông tin danh mục
                    break;
                case 4:
                    // Xóa danh mục
                    break;
                case 5:
                    // Cập nhật trạng thái danh mục
                    break;
                case 6:
                    System.out.println("Quay lại menu chính.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 6);
    }

    private static void productMenu(Scanner scanner, Product[] arrProduct, Categories[] arrCategories) {
        int choice;
        do {
            System.out.println("********************PRODUCT MENU**************");
            System.out.println("1. Nhập thông tin sản phẩm");
            System.out.println("2. Hiển thị thông tin sản phẩm");
            System.out.println("3. Cập nhật thông tin sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Nhập thông tin sản phẩm
                    break;
                case 2:
                    // Hiển thị thông tin sản phẩm
                    break;
                case 3:
                    // Cập nhật thông tin sản phẩm
                    break;
                case 4:
                    // Xóa sản phẩm
                    break;
                case 5:
                    System.out.println("Quay lại menu chính.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 5);
    }
}
