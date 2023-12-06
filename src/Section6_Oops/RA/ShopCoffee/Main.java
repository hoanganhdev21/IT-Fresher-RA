package Section6_Oops.RA.ShopCoffee;


import Section6_Oops.RA.ShopCoffee.Entity.Categories;
import Section6_Oops.RA.ShopCoffee.Entity.Product;

import java.util.Scanner;

public class Main {
    // khởi tạo mảng danh mục
    Categories[] arrCategories = new Categories[100];
    //khởi tạo mảng sản phẩm
    Product[] arrProduct = new Product[100];
    //khai baáo biến chỉ số cao nhất đang quản lý trong mảng arrcategories
    int currentcateLog = 0;
    int currentProduct = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //khởi tạo đối tượng main
        Main objMain = new Main();
        do {
            System.out.println("<<<<<<<<<<<<<<<<<<< SHOP MENU >>>>>>>>>>>>>>>>>>>>>>>\n" +
                    "1. Quản lý danh mục sản phẩm\n" +
                    "2. Quản lý sản phẩm\n" +
                    "3. Thoát");
            System.out.println("Nhập lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    objMain.displayMenuCategories(scanner, objMain);
                    break;
                case 2:
                    objMain.displayMenuProduct(scanner, objMain);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn 1-3!");
            }
        } while (true);
    }

    // Câu 1
    public void displayMenuCategories(Scanner scanner, Main objMain) {
        boolean isEit = true;
        do {
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<< CATEGORIES MENU >>>>>>>>>>>>>>>>>>>>>>>>\n" +
                    "1. Nhập thông tin các danh mục\n" +
                    "2. Hiển thị thông tin các danh mục\n" +
                    "3. Cập nhật thông tin danh mục\n" +
                    "4. Xóa danh mục\n" +
                    "5. Cập nhật trạng thái danh mục\n" +
                    "6. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    objMain.inputCategories(scanner);
                    break;
                case 2:
                    objMain.displayCategories();
                    break;
                case 3:
                    objMain.updateCategories(scanner);
                    break;
                case 4:
                    //objMain.deleteCategories(scanner);
                    break;
                case 5:
                    objMain.statusCategories(scanner);
                    break;
                case 6:
                    isEit = false;
                    break;
                default:
                    System.out.println("Vui lòng chọn 1-6!");
            }
        } while (isEit);
    }

    public void inputCategories(Scanner scanner) {
        System.out.println("Nhập vào số lượng danh mục: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            arrCategories[currentcateLog] = new Categories();
            arrCategories[currentcateLog].inputData(scanner, arrCategories, currentcateLog);
            currentcateLog++;
        }
    }

    public void displayCategories() {
        System.out.println("Thông tin danh mục: ");
        for (int i = 0; i < currentcateLog; i++) {
            arrCategories[i].displayData();
            System.out.println("\n-------------------------------------------------");
        }
    }

    public void updateCategories(Scanner scanner) {
        for (int i = 0; i < currentcateLog; i++) {
            arrCategories[currentcateLog] = new Categories();
            arrCategories[i].updateData(scanner, arrCategories);
            System.out.println("\n-----------------------------------------------");
        }
    }

//    public void deleteCategories(Scanner scanner) {
//        for (int i = 0; i < currentcateLog; i++) {
//            arrCategories[currentcateLog] = new Categories();
//            arrCategories[i].deleteData(scanner, arrCategories);
//        }
//    }

    public void statusCategories(Scanner scanner) {
        for (int i = 0; i < currentcateLog; i++) {
            arrCategories[currentcateLog] = new Categories();
            arrCategories[i].updateStatus(scanner, arrCategories);
        }
    }

    //Câu 2
    public void displayMenuProduct(Scanner scanner, Main objMain) {
        boolean isExit = true;
        do {
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<< PRODUCT MENU >>>>>>>>>>>>>>>>>>>>>>>>>>>>\n" +
                    "1. Nhập thông tin các sản phẩm\n" +
                    "2. Hiển thị thông tin các sản phẩm\n" +
                    "3. Sắp xếp các sản phẩm theo giá\n" +
                    "4. Cập nhật thông tin sản phẩm theo mã sản phẩm\n" +
                    "5. Xóa sản phẩm theo mã sản phẩm\n" +
                    "6. Tìm kiếm các sản phẩm theo tên sản phẩm\n" +
                    "7. Tìm kiếm sản phẩm trong khoảng giá a – b (a,b nhập từ bàn phím)\n" +
                    "8. Thoát\n");
            System.out.println("Lựa chọn của bạn là: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    objMain.inputDataProduct(scanner);
                    break;
                case 2:
                    objMain.displayProduct();
                    break;
                case 3:
                    objMain.sortByPriceProduct();
                    break;
                case 4:
                    objMain.updateProduct(scanner);
                    break;
                case 5:
                    objMain.deleteProduct(scanner);
                    break;
                case 6:
                    objMain.searchProductName(scanner);
                    break;
                case 7:
                    objMain.searchProductPrice(scanner);
                    break;
                case 8:
                    isExit = false;
                    break;
                default:
                    System.out.println("Mời nhập từ 1-8!");
            }
        } while (isExit);
    }

    public void inputDataProduct(Scanner scanner) {
        System.out.println("Nhập số lượng sản phẩm: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            arrProduct[currentProduct] = new Product();
            arrProduct[currentProduct].inputData(scanner, arrProduct, arrCategories);
            currentProduct++;
        }
    }

    public void displayProduct() {
        for (int i = 0; i < currentProduct; i++) {
            arrProduct[i].displayProduct();
            System.out.println("\n---------------------------------------------------------------");
        }
    }

    public void sortByPriceProduct() {
        System.out.println("Danh sách sản phẩm trước khi sắp xếp: ");
        arrProduct[currentProduct].displayProduct();
        System.out.println("-------------------------------------");
        System.out.println("Danh sách sắp xếp theo giá tăng dần: ");
        for (int i = 0; i < currentProduct; i++) {
            arrProduct[i].sortByPrice();
            System.out.println("---------------------------------");
        }
    }

    public void updateProduct(Scanner scanner) {
        for (int i = 0; i < currentProduct; i++) {
            arrProduct[currentProduct] = new Product();
            arrProduct[i].updateProductById(scanner, arrProduct, arrCategories);
            System.out.println("----------------------------------");
        }
    }

    public void deleteProduct(Scanner scanner) {
        for (int i = 0; i < currentProduct; i++) {
            arrProduct[i].deleteProductById(scanner);
        }
    }

    public void searchProductName(Scanner scanner) {
        for (int i = 0; i < currentProduct; i++) {
            arrProduct[i].searchProductName(scanner);
        }
    }

    public void searchProductPrice(Scanner scanner) {
        for (int i = 0; i < currentProduct; i++) {
            arrProduct[i].searchProductPrice(scanner);
        }
    }
}

