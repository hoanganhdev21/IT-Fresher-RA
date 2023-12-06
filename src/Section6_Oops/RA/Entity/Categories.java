package Section6_Oops.RA.Entity;
import java.util.Scanner;
public class Categories {
    private int catalogId;
    private String catalogName;
    private String descriptions;
    private boolean catalogStatus;

    public Categories() {
    }

    public Categories(int catalogId, String catalogName, String descriptions, boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }

    // Getter and Setter methods

    public void inputData(Scanner scanner, Categories[] arrCategories, int index) {
        System.out.println("Enter category information:");
        this.catalogId = index + 1;
        System.out.print("Category Name: ");
        this.catalogName = scanner.nextLine();
        System.out.print("Description: ");
        this.descriptions = scanner.nextLine();
        System.out.print("Category Status (true for active, false for inactive): ");
        this.catalogStatus = scanner.nextBoolean();
    }

    public void displayData() {
        System.out.println("Category ID: " + this.catalogId);
        System.out.println("Category Name: " + this.catalogName);
        System.out.println("Description: " + this.descriptions);
        System.out.println("Category Status: " + (this.catalogStatus ? "Active" : "Inactive"));
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }
}
