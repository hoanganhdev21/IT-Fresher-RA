package Section6_Oops.RA.Entity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Product {
    private String productId;
    private String productName;
    private float price;
    private String description;
    private Date created;
    private int catalogId;
    private int productStatus;

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

    // Getter and Setter methods

    public void inputData(Scanner scanner, Product[] arrProduct, int index, Categories[] arrCategories) {
        System.out.println("Enter product information:");
        System.out.print("Product Name: ");
        this.productName = scanner.nextLine();
        System.out.print("Price: ");
        this.price = scanner.nextFloat();
        scanner.nextLine();  // Consume the newline character
        System.out.print("Description: ");
        this.description = scanner.nextLine();
        System.out.print("Created Date (dd/mm/yyyy): ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.created = sdf.parse(scanner.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Display categories for user selection
        System.out.println("Available Categories:");
        for (Categories category : arrCategories) {
            category.displayData();
        }

        // Input and validate catalogId
        boolean isValidCatalogId = false;
        while (!isValidCatalogId) {
            System.out.print("Enter Catalog ID for the product: ");
            int inputCatalogId = scanner.nextInt();
            for (Categories category : arrCategories) {
//                if (category.getCatalogId() == inputCatalogId) {
//                    this.catalogId = inputCatalogId;
//                    isValidCatalogId = true;
//                    break;
//                }
            }
            if (!isValidCatalogId) {
                System.out.println("Invalid Catalog ID. Please enter a valid Catalog ID.");
            }
        }

        // Input and validate productStatus
        boolean isValidProductStatus = false;
        while (!isValidProductStatus) {
            System.out.print("Enter Product Status (0: Selling, 1: Out of stock, 2: Not for sale): ");
            int inputProductStatus = scanner.nextInt();
            if (inputProductStatus >= 0 && inputProductStatus <= 2) {
                this.productStatus = inputProductStatus;
                isValidProductStatus = true;
            } else {
                System.out.println("Invalid Product Status. Please enter a valid Product Status.");
            }
        }
    }

    public void displayData() {
        System.out.println("Product ID: " + this.productId);
        System.out.println("Product Name: " + this.productName);
        System.out.println("Price: " + this.price);
        System.out.println("Description: " + this.description);
        System.out.println("Created Date: " + new SimpleDateFormat("dd/MM/yyyy").format(this.created));
        System.out.println("Catalog ID: " + this.catalogId);
        System.out.println("Product Status: " + this.productStatus);
    }
}
