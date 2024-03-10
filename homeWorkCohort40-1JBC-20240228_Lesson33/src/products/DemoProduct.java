package products;

import java.util.HashMap;
import java.util.Map;

class Product {
    private String productName;
    private double productPrice;

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }
}

class ProductCatalog {
    private Map<Integer, Product> products;

    public ProductCatalog() {
        products = new HashMap<>();
    }

    public void addProduct(int productId, Product product) {
        if (products.containsKey(productId)) {
            System.out.println("Error: Product with ID " + productId + " already exists in the catalog.");
        } else {
            products.put(productId, product);
            System.out.println("Added Product - ID: " + productId + ", Name: " + product.getProductName() + ", Price: " + product.getProductPrice());
        }
    }

    public void deleteProduct(int productId) {
        Product removedProduct = products.get(productId);
        if (removedProduct != null) {
            System.out.println("Deleted Product - ID: " + productId + ", Name: " + removedProduct.getProductName() + ", Price: " + removedProduct.getProductPrice());
        } else {
            System.out.println("Error: Product with ID " + productId + " not found in the catalog.");
        }
    }

    public Product findProduct(int productId) {
        Product product = products.get(productId);
        if (product != null) {
            System.out.println("Found Product - ID: " + productId + ", Name: " + product.getProductName() + ", Price: " + product.getProductPrice());
            return product;
        } else {
            System.out.println("Error: Product with ID " + productId + " not found in the catalog.");
            return null;
        }
    }
}

public class DemoProduct {
    public static void main(String[] args) {

        ProductCatalog catalog = new ProductCatalog();

        Product product1 = new Product("Phone", 500.0);
        Product product2 = new Product("Laptop", 1000.0);

        catalog.addProduct(1, product1);
        catalog.addProduct(2, product2);

        catalog.findProduct(1);

        catalog.deleteProduct(2);

        catalog.findProduct(2);
    }
}
