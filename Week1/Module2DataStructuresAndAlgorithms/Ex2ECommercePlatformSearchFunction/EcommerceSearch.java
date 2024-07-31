package Week1.Module2DataStructuresAndAlgorithms.Ex2ECommercePlatformSearchFunction;

import java.util.Arrays;
import java.util.Comparator;

public class EcommerceSearch {

    // Linear search implementation
    public static Product linearSearch(Product[] products, String productName) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null;
    }

    // Binary search implementation
    public static Product binarySearch(Product[] products, String productName) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductName().compareToIgnoreCase(productName);

            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // Sample products
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Smartphone", "Electronics"),
            new Product(3, "Headphones", "Electronics"),
            new Product(4, "Shoes", "Fashion"),
            new Product(5, "Backpack", "Fashion")
        };

        // Linear search
        System.out.println("Linear Search:");
        Product result = linearSearch(products, "Laptop");
        System.out.println(result != null ? result : "Product not found");

        // Sorting products for binary search
        Arrays.sort(products, Comparator.comparing(Product::getProductName));

        // Binary search
        System.out.println("\nBinary Search:");
        result = binarySearch(products, "Smartphone");
        System.out.println(result != null ? result : "Product not found");
    }
}
