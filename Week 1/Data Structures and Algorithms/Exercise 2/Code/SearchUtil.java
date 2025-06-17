
public class SearchUtil {
    // Linear search by productName
    public static Product linearSearchByName(Product[] products, String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equals(name)) {
                return products[i];
            }
        }

        return null; // indicates not found
    }

    // Binary search by productId (assuming sorted by ID)
    public static Product binarySearchById(Product[] products, int id) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (products[mid].getProductId() == id) {
                return products[mid];
            } else if (products[mid].getProductId() > id) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return null; // NOT FOUND
    }
}
