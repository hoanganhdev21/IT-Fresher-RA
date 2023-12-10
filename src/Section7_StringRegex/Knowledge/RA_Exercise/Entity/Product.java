package Section7_StringRegex.Knowledge.RA_Exercise.Entity;

import java.util.Scanner;

public class Product {
    private int proNo;
    private String productId;
    private String productName;
    private float importPrice;
    private float exportPrice;
    private float profit;
    private int quantity;
    private String descriptions;
    private boolean status;

    // Constructors
    public Product() {
        this.proNo = lastProNo++;
    }
    private static int lastProNo = 0;


    public Product(int proNo) {
        this.proNo = proNo;
    }

    public Product(String productId, String productName, float importPrice, float exportPrice,
                   int quantity, String descriptions, boolean status) {
        this.productId = productId;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.quantity = quantity;
        this.descriptions = descriptions;
        this.status = status;

    }

    public int getProNo() {
        return proNo;
    }

    public void setProNo(int proNo) {
        this.proNo = proNo;
    }

    // Getter and Setter methods
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getProfit() {
        return profit;
    }

    public void setProfit(float profit) {
        this.profit = profit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Input and Display methods
    public boolean inputData(Scanner scanner, Product[] arrProduct, int index) {
        boolean validProductId = false;
        do {
            System.out.print("Nhập mã sản phẩm (4 ký tự, bắt đầu bằng P): ");
            this.setProductId(scanner.next());

            if (isValidProductId(this.getProductId(), arrProduct, index)) {
                validProductId = true;
            } else {
                System.out.println("Mã sản phẩm không hợp lệ hoặc đã tồn tại. Vui lòng nhập lại.");
            }
        } while (!validProductId);
        this.setProductName(scanner.nextLine());

        while (!isValidProductName(this.getProductName(), arrProduct, index)) {
            System.out.println("Nhập tên sản phẩm (từ 6-50 ký tự): ");
            this.setProductName(scanner.nextLine());
        }


        boolean validImportPrice = false;
        while (!validImportPrice){
            System.out.println("Nhập giá nhập sản phẩm: ");
            this.importPrice = Float.parseFloat(scanner.nextLine());
            if (this.importPrice > 0) {
                validImportPrice = true;
            }else {
                System.out.println("Vui lòng nhập lại.");
            }
        }



        boolean validExportPrice = false;
        while (!validExportPrice) {
            System.out.println("Nhập giá xuất (giá xuất phải lớn hơn giá nhập và tăng ít nhất 20% so với giá nhập): ");
            this.exportPrice = scanner.nextFloat();

            if (this.exportPrice >= this.importPrice * 1.2) {
                validExportPrice = true;
            } else {
                System.out.println("Giá xuất không hợp lệ. Hãy nhập lại.");
            }
        }

        boolean validQuantity = false;
        while (!validQuantity){
            System.out.println("Nhập số lượng sản phẩm: ");
            this.quantity = scanner.nextInt();
            if (this.quantity > 0) {
                validQuantity = true;
            }else {
                System.out.println("Vui lòng nhập lại.");
            }
        }

        System.out.println("Nhập mô tả sản phẩm: ");
        this.descriptions = scanner.nextLine();
        System.out.print("Nhập trạng thái sản phẩm (true – Đang bán, false – Không bán): ");
        do {
            String status = scanner.nextLine();
            if (status.equals("true") || status.equals("false")) {
                return Boolean.parseBoolean(status);
            } else {
                System.err.println("Nhập sai vui lòng nhập lại");
            }
        } while (true);


    }

    public void displayData() {
        System.out.println("STT: " + this.getProNo());
        System.out.println("Mã sản phẩm: " + this.getProductId());
        System.out.println("Mã sản phẩm: " + this.getProductId());
        System.out.println("Tên sản phẩm: " + this.getProductName());
        System.out.println("Giá nhập sản phẩm: " + this.getImportPrice());
        System.out.println("Giá xuất sản phẩm: " + this.getExportPrice());
        System.out.println("Lợi nhuận sản phẩm: " + this.getProfit());
        System.out.println("Số lượng sản phẩm: " + this.getQuantity());
        System.out.println("Mô tả sản phẩm: " + this.getDescriptions());
        System.out.println("Trạng thái sản phẩm: " + this.getStatus());
    }

    private boolean isValidProductId(String productId, Product[] arrProduct, int index) {
        return productId != null && productId.length() == 4 && productId.startsWith("P");
    }


    public void calculateProfit() {
        this.profit = this.exportPrice - this.importPrice;
    }

    private boolean isValidProductName(String productName, Product[] arrProduct, int index) {
        if (productName.length() >= 6 && productName.length() <= 50) {
            for (int i = 0; i < index; i++) {
                if (arrProduct[i] != null && arrProduct[i].getProductName().equals(productName)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}