package Section7_StringRegex.Knowledge.RA_Exercise.Run;

import Section7_StringRegex.Knowledge.RA_Exercise.Entity.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] arrProduct = new Product[100];
        int productIndex = 0;
        int choice;
        do {
            System.out.println("<<<<<<<<<<<<<<<<<<<< MENU >>>>>>>>>>>>>>>>>>>>");
            System.out.println("1. Nhập thông tin n sản phẩm (n nhập từ bàn phím)");
            System.out.println("2. Hiển thị thông tin các sản phẩm");
            System.out.println("3. Tính lợi nhuận các sản phẩm");
            System.out.println("4. Sắp xếp các sản phẩm theo lợi nhuận giảm dần");
            System.out.println("5. Thống kê các sản phẩm theo giá");
            System.out.println("6. Tìm các sản phẩm theo tên sản phẩm");
            System.out.println("7. Nhập sản phẩm");
            System.out.println("8. Bán sản phẩm");
            System.out.println("9. Cập nhật trạng thái sản phẩm");
            System.out.println("10. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sản phẩm (n): ");
                    int n = scanner.nextInt();

                    for (int i = 0; i < n; i++) {
                        arrProduct[productIndex] = new Product();
                        arrProduct[productIndex].inputData(scanner, arrProduct,productIndex);
                        productIndex++;
                    }

                case 2:
                    for (int i = 0; i < productIndex; i++) {
                        arrProduct[i].displayData();
                        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>");
                    }
                    break;
                case 3:
                    for (Product product : arrProduct) {
                        if (product != null) {
                            product.calculateProfit();
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < arrProduct.length - 1; i++) {
                        for (int j = i + 1; j < arrProduct.length; j++) {
                            if (arrProduct[i] != null && arrProduct[j] != null &&
                                    arrProduct[i].getProfit() < arrProduct[j].getProfit()) {
                                Product temp = arrProduct[i];
                                arrProduct[i] = arrProduct[j];
                                arrProduct[j] = temp;
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.print("Nhập giá bắt đầu (fromPrice): ");
                    float fromPrice = scanner.nextFloat();
                    System.out.print("Nhập giá kết thúc (toPrice): ");
                    float toPrice = scanner.nextFloat();

                    int count = 0;
                    for (Product product : arrProduct) {
                        if (product != null && product.getExportPrice() >= fromPrice && product.getExportPrice() <= toPrice) {
                            count++;
                        }
                    }

                    System.out.println("Số lượng sản phẩm có giá bán trong khoảng từ " + fromPrice + " đến " + toPrice + ": " + count);
                    break;
                case 6:
                    System.out.print("Nhập tên sản phẩm cần tìm: ");
                    String searchName = scanner.next();

                    boolean found = false;
                    for (Product product : arrProduct) {
                        if (product != null && product.getProductName().equalsIgnoreCase(searchName)) {
                            product.displayData();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Không tìm thấy sản phẩm có tên: " + searchName);
                    }

                    break;
                case 7:
                    System.out.print("Nhập mã sản phẩm cần nhập: ");
                    String productId = scanner.next();

                    boolean found1 = false;
                    for (Product product : arrProduct) {
                        if (product != null && product.getProductId().equalsIgnoreCase(productId)) {
                            System.out.print("Nhập số lượng sản phẩm cần nhập: ");
                            int quantity = scanner.nextInt();
                            product.setQuantity(product.getQuantity() + quantity);
                            found1 = true;
                            System.out.println("Nhập sản phẩm thành công.");
                            break;
                        }
                    }

                    if (!found1) {
                        System.out.println("Không tìm thấy sản phẩm có mã: " + productId);
                    }
                    break;
                case 8:

                    break;
                case 9:
                    System.out.print("Nhập mã danh mục cần cập nhật trạng thái: ");
                    int updateStatus = scanner.nextInt();
                    scanner.nextLine();
                    boolean productFound = false;
                    for (int i = 0; i < productIndex; i++)
                        if (arrProduct[i].getProNo() == updateStatus) {
                            System.out.println("Chọn trạng thái mới (true - hoạt động, false - không hoạt động):");
                            String newStatus = scanner.nextLine();
                            arrProduct[i].setStatus(newStatus.isEmpty());
                            productFound = true;
                            System.out.println("Đã cập nhật trạng thái cho danh mục có mã " + updateStatus);
                            break;
                        }
                    if (!productFound) {
                        System.out.println("Không tìm thấy danh mục có mã " + updateStatus);
                    }
                    break;
                case 10:
                    System.out.println("Chương trình kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        } while (choice != 10);
    }
}