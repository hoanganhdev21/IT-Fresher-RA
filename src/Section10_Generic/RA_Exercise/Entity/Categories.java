package Section10_Generic.RA_Exercise.Entity;

import Section10_Generic.RA_Exercise.IShop;

import java.util.Scanner;

public class Categories implements IShop {
    private int catalogId;
    private String catalogName;
    private boolean status;

    public Categories() {
    }

    public Categories(int catalogId, String catalogName, boolean status) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.status = status;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
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
        System.out.print("Enter Catalog ID: ");
        this.catalogId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter Catalog Name: ");
        this.catalogName = scanner.nextLine();
        System.out.print("Enter Catalog Status (true/false): ");
        this.status = scanner.nextBoolean();
    }

    @Override
    public void displayData() {
        System.out.println("Catalog ID: " + catalogId);
        System.out.println("Catalog Name: " + catalogName);
        System.out.println("Catalog Status: " + status);
    }
}
