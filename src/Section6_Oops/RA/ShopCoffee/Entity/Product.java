package Section6_Oops.RA.ShopCoffee.Entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Product {
    private String productId;
    private String productName;
    private float price;
    private String description;
    private Date created;
    private int catalogId;
    private int productStatus;
    private List<Product> productList;

    public Product() {
    }

    public Product(String productId, String productName, float price, String description, Date created, int catalogId, int productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.created = created;
        this.catalogId = catalogId;
        this.productStatus = productStatus;
    }

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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public int getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(int productStatus) {
        this.productStatus = productStatus;
    }

    public void inputData(Scanner scanner, Product[] arrProduct, Categories[] arrCategories) {
        System.out.println("Nhập mã sản phẩm (Bắt đầu bằng C , S hoặc A: ");
        this.productId = scanner.nextLine();
        while (!validateProductId(productId)) {
            System.out.println("Mã sản phẩm không hợp lệ, vui lòng nhập lại theo định dạng: " + generateDefaultProductId());
            productId = scanner.nextLine();
        }
        System.out.println("Nhập tên sản phẩm (Từ 10-50 ký tự: ");
        this.productName = scanner.nextLine();
        while (!validateProductName(productName)) {
            System.out.println("Tên sản phẩm không hợp lệ, vui lòng nhập lại!");
            productName = scanner.nextLine();
        }
        System.out.println("Nhấp giá sản phẩm(LỚN HƠN 0): ");
        this.price = Float.parseFloat(scanner.nextLine());
        while (price <= 0) {
            System.out.println("Gía sản phẩm không hợp lệ vui lòng nhập lại!");
            price = Float.parseFloat(scanner.nextLine());
        }
        System.out.println("Nhập mô tả sản phẩm: ");
        this.description = scanner.nextLine();
        System.out.println("Ngày nhập sản phẩm (dd/mm/yyyy): ");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        try {
            created = dateFormat.parse(scanner.nextLine());
        } catch (ParseException e) {
            System.out.println("Vui lòng viết đúng format dd/mm/yyyy!");
            throw new RuntimeException(e);
        }
        System.out.println("Trạng thái sản phẩm (0: Đang bán – 1: Hết hàng – 2: Không bán): ");
        this.productStatus = Integer.parseInt(scanner.nextLine());
        while (productStatus < 0 || productStatus > 2) {
            System.out.println("Trạng thái nhập không hợp lệ, vui lòng nhập lại!");
            productStatus = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập mã danh mục của sản phẩm: ");
        this.catalogId = Integer.parseInt(scanner.nextLine());
        while (!isValiCatalogId(catalogId, arrCategories)) {
            System.out.println("Mã danh mục không hợp lệ, vui lòng nhập lại!");
            catalogId = Integer.parseInt(scanner.nextLine());
        }
        //gán giá trị cho các thuộc tính
        setProductId(productId);
        setProductName(productName);
        setPrice(price);
        setProductStatus(productStatus);
        setCatalogId(catalogId);
    }

    //Kiểm tra mã danh mục có hợp lệ không
    private boolean isValiCatalogId(int catalogId, Categories[] arrCategories) {
        for (Categories category : arrCategories) {
            if (category.getCatelogId() == catalogId) {
                return true;
            }
        }
        return false;
    }

    // Các phương thức kiểm tra và hỗ trợ
    private boolean validateProductId(String productId) {
        // Kiểm tra xem productId có đúng định dạng hay không
        return productId.matches("[CSA]\\d{3}");
    }

    private boolean validateProductName(String productName) {
        // Kiểm tra xem productName có độ dài từ 10 đến 50 ký tự không
        return productName.length() >= 10 && productName.length() <= 50;
    }

    private String generateDefaultProductId() {
        // Tạo một productId mặc định nếu đầu vào không hợp lệ
        return "C000 || S000 || A000";

    }

    public void displayProduct() {
        System.out.printf("Mã sản phẩm: %s - Tên sản phẩm: %s - Gía: %s\n" +
                        "Ngày nhập: %s - Mã danh mục: %s - Trạng thái: %s\n", this.productId, this.productName, this.price,
                this.created, this.catalogId, (this.productStatus == 0 ? "Đang bán" : this.productStatus == 1 ? "Hết hàng" : "Không bán"));
    }

    //sắp xếp sản phẩm theo giá
    public void sortByPrice() {
        // Sắp xếp sản phẩm theo giá tăng dần
        Collections.sort(productList, Comparator.comparing(Product::getPrice));
    }

    public void updateProductById(Scanner scanner, Product[] arrProduct, Categories[] arrCategories ) {
        System.out.println("Nhập mã sản phẩm cập nhật: ");
        String newCreated = scanner.nextLine();
        for(Product product :productList){
            if (product.getProductId().equals(newCreated)) {
                System.out.println("Thông tin sản phẩm trước khi cập nhật:");
                product.displayProduct();
                System.out.println("Nhập mới thông tin cho sản phẩm:");
                product.inputData(scanner, arrProduct, arrCategories);
                System.out.println("Thông tin sản phẩm sau khi cập nhật:");
                product.displayProduct();
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm với mã " + newCreated);
    }
    public void deleteProductById(Scanner scanner) {
        System.out.println("Nhập mã sản phẩm bạn muốn xóa: ");
        String newproductId = scanner.nextLine();
        Iterator<Product> iterator = productList.iterator();// Sử dụng Iterator để lặp qua danh sách sản phẩm.
        while (iterator.hasNext()) {//Lặp qua danh sách sản phẩm bằng cách kiểm tra xem có phần tử tiếp theo không.
            Product product = iterator.next();
            if (product.getProductId().equals(newproductId)) {
                iterator.remove(); // Sử dụng Iterator để xóa phần tử hiện tại từ danh sách
                System.out.println("Đã xóa sản phẩm có mã " + newproductId);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm với mã " + newproductId);
    }
    public void searchProductName(Scanner scanner){
        System.out.println("Nhập tên sản phẩm bạn cần tìm: ");
        String searchName = scanner.nextLine();
        List<Product> matchingProduct = new ArrayList<>();
        for (Product product : productList) {
            if (product.getProductName().toLowerCase().contains(searchName.toLowerCase())){// Kiểm tra xem tên sản phẩm của sản phẩm hiện tại có chứa chuỗi tìm kiếm hay không.
                matchingProduct.add(product);
            }
        }
        System.out.println("Không tìm thấy tên sản phẩm có tên " +searchName);
    }
    public void searchProductPrice(Scanner scanner){
        System.out.println("Nhập khoảng giá đầu: ");
        float a = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập khoảng giá cuối: ");
        float b = Float.parseFloat(scanner.nextLine());
        List<Product> matchingProduct = new ArrayList<>();
        for (Product product : productList) {
            float price = product.getPrice();
            if (price >= a && price <= b){
                matchingProduct.add(product);
            }
        }
    }
}
