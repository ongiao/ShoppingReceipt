package service;

import config.ExemptCatagory;
import config.Resources;
import model.Product;
import model.ShoppingCart;
import util.DigitHelper;
import util.PropertiesHelper;

import java.io.IOException;

public class CalculateReceiptService {
    private ShoppingCart cart;

    public CalculateReceiptService (ShoppingCart cart) {
        this.cart = cart;
    }

    public ShoppingCart getCart () {
        return cart;
    }

    public double calculateSubTotal() {
        double subTotal = 0.00;

        for (Product product : this.cart.getProducts()) {
            subTotal += product.getUnitPrice() * product.getQuantity();
        }

        return DigitHelper.formatDigit(subTotal);
    }

    public double calculateTax(Product product) throws IOException {
        String location = product.getPurchaseLocation();
        String productName = product.getProductName();
        int quantity = product.getQuantity();

        double taxRate = ExemptCatagory.EXEMPT_CATAGORIES.get(location).contains(productName) ? 0 :
                Double.valueOf(PropertiesHelper.getValue(Resources.TAX_RATE_FILE_PATH, location));

        double salesTax = DigitHelper.formatDigit(DigitHelper.roundUp(product.getUnitPrice() * quantity * taxRate));
        this.cart.addTax(salesTax);

        return salesTax;
    }

    public double calculateTotal() throws IOException {
        double total = 0.00;

        for (Product product : this.cart.getProducts()) {
            total += (product.getUnitPrice() * product.getQuantity()) +  calculateTax(product);
        }

        return DigitHelper.formatDigit(total);
    }
}
