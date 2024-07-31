package Week1.Module2DataStructuresAndAlgorithms.Ex1InventoryManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class InventoryManagementSystem {
    private Map<Integer, Product> inventory;

    public InventoryManagementSystem() {
        this.inventory = new HashMap<>();
    }

    // Method to add a product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    // Method to update a product
    public void updateProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            inventory.put(product.getProductId(), product);
        } else {
            System.out.println("Product not found.");
        }
    }

    // Method to delete a product
    public void deleteProduct(int productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
        } else {
            System.out.println("Product not found.");
        }
    }

    // Method to display all products
    public void displayProducts() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        // Adding products
        ims.addProduct(new Product(1, "Laptop", 10, 999.99));
        ims.addProduct(new Product(2, "Smartphone", 15, 499.99));
        ims.addProduct(new Product(3, "Tablet", 7, 299.99));

        // Display products
        System.out.println("All Products:");
        ims.displayProducts();

        // Updating a product
        ims.updateProduct(new Product(1, "Laptop", 5, 899.99));
        System.out.println("\nAfter Update:");
        ims.displayProducts();

        // Deleting a product
        ims.deleteProduct(2);
        System.out.println("\nAfter Deletion:");
        ims.displayProducts();
    }
}
