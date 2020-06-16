package model;

public class Product {
    private String productName;
    private double unitPrice;
    private int quantity;
    private String purchaseLocation;

    public Product (String productName, double unitPrice, int quantity, String purchaseLocation) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.purchaseLocation = purchaseLocation;
    }

    public String getProductName () {
        return productName;
    }

    public int getQuantity () {
        return quantity;
    }

    public String getPurchaseLocation () {
        return purchaseLocation;
    }

    public double getUnitPrice () {
        return unitPrice;
    }
}
