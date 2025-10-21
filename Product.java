import java.util.ArrayList;
public class Product {
    protected String productName;
    protected int productID;
    protected double price;

    // No-arg constructor
    public Product() {
        this.productName = "";
        this.productID = 0;
        this.price = 0.0;
    }

    // Argument constructor
    public Product(String productName, int productID, double price) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
    }

    // Override toString
    @Override
    public String toString() {
        return "Product Name: " + productName + ", ID: " + productID + ", Price: $" + String.format("%.2f", price);
    }
}

class Electronics extends Product {
    private int warrantyMonths;

    public Electronics(String productName, int productID, double price, int warrantyMonths) {
        super(productName, productID, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String toString() {
        return "Electronics: " + super.toString() + ", Warranty: " + warrantyMonths + " months";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Electronics) {
            Electronics other = (Electronics) obj;
            return this.warrantyMonths == other.warrantyMonths;
        }
        return false;
    }
}

class Clothing extends Product {
    private String size;

    public Clothing(String productName, int productID, double price, String size) {
        super(productName, productID, price);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothing: " + super.toString() + ", Size: " + size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Clothing) {
            Clothing other = (Clothing) obj;
            return this.size.equals(other.size);
        }
        return false;
    }
}

public class TestProduct {
    public static void main(String[] args) {
        // Create an ArrayList to hold products
        ArrayList<Product> products = new ArrayList<>();

        // Add Electronics and Clothing objects
        products.add(new Electronics("Smartphone", 101, 699.99, 24));
        products.add(new Clothing("T-Shirt", 202, 19.99, "L"));
        products.add(new Electronics("Laptop", 102, 1299.99, 36));
        products.add(new Clothing("Jeans", 203, 49.99, "M"));
        products.add(new Electronics("Smartphone", 101, 699.99, 24));

        // Print all products
        for (Product p : products) {
            System.out.println(p);
        }

        // Compare specific pairs
        System.out.println("\nComparison between first and fifth product:");
        System.out.println("Are they equal? " + products.get(0).equals(products.get(4)));

        System.out.println("\nComparison between second and fourth product:");
        System.out.println("Are they equal? " + products.get(1).equals(products.get(3)));
    }
}


