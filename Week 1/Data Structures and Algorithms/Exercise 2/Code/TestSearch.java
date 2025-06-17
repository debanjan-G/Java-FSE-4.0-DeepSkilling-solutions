import java.util.Arrays;
import java.util.Comparator;

public class TestSearch {
    public static void main(String[] args) {
        // Create array of products
        Product[] products = {
                new Product(3, "Laptop", "Electronics"),
                new Product(1, "Mouse", "Electronics"),
                new Product(5, "Keyboard", "Electronics"),
                new Product(2, "Monitor", "Electronics"),
                new Product(4, "Headphones", "Electronics")
        };

        // Test linear search
        System.out.println("=== Linear Search Test ===");

        System.out.println("Searching for product with name `Laptop` ");
        Product result = SearchUtil.linearSearchByName(products, "Laptop");

        if (result != null) {
            System.out.println("Found: " + result);
        } else {
            System.out.println("Product not found");
        }

        System.out.println(); // printing empty line for readability

        System.out.println("Searching for Product with name `Phone`");
        result = SearchUtil.linearSearchByName(products, "Phone");

        if (result != null) {
            System.out.println("Found: " + result);
        } else {
            System.out.println("Product 'Phone' not found");
        }

        // Binary Search Test
        System.out.println("\n=== Binary Search Test ===");

        // Sort products by ID for binary search
        // Arrays.sort(products, Comparator.comparingInt(Product::getProductId));
        Arrays.sort(products, (p1, p2) -> Integer.compare(p1.getProductId(), p2.getProductId()));

        System.out.println("Products sorted by ID:");
        for (Product p : products) {
            System.out.println(p);
        }

        // Test binary search
        result = SearchUtil.binarySearchById(products, 3);
        if (result != null) {
            System.out.println("\nFound product with ID 3: " + result);
        } else {
            System.out.println("Product with ID 3 not found");
        }

        result = SearchUtil.binarySearchById(products, 6);
        if (result != null) {
            System.out.println("Found product with ID 6: " + result);
        } else {
            System.out.println("Product with ID 6 not found");
        }
    }
}