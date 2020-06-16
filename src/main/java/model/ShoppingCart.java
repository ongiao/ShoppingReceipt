package model;

import util.DigitHelper;
import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> products;
    private double totalPaidTax = 0.00;

    public ShoppingCart () {
        products = new ArrayList<Product>();
    }

    public double getTotalPaidTax () {
        return DigitHelper.formatDigit(totalPaidTax);
    }

    public void setTotalPaidTax (double totalPaidTax) {
        this.totalPaidTax = totalPaidTax;
    }

    public void addTax(double tax) {
        this.totalPaidTax += tax;
    }

    public ArrayList<Product> getProducts () {
        return products;
    }

    public void addProductToCart (Product product) {
        this.products.add(product);
    }
}
