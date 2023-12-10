package Section10_Generic.RA_Exercise.Entity;

import Section10_Generic.RA_Exercise.IShop;

import java.util.Scanner;

public class Product implements IShop {
    private String productId;
    private String productName;
    private float price;
    private String title;
    private int catalogId;
    private boolean status;

    public Product() {

    }
    public Product(String productId, String productName, float price, String title, int catalogId, boolean status) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.title = title;
        this.catalogId = catalogId;
        this.status = status;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Product ID: ");
        this.productId = scanner.nextLine();
        System.out.print("Enter Product Name: ");
        this.productName = scanner.nextLine();
        System.out.print("Enter Product Price: ");
        this.price = scanner.nextFloat();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter Product Title: ");
        this.title = scanner.nextLine();
        System.out.print("Enter Catalog ID: ");
        this.catalogId = scanner.nextInt();
        System.out.print("Enter Product Status (true/false): ");
        this.status = scanner.nextBoolean();
    }

    @Override
    public void displayData() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);
        System.out.println("Product Title: " + title);
        System.out.println("Catalog ID: " + catalogId);
        System.out.println("Product Status: " + status);
    }
}
