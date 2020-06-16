package model;

import util.StringHelper;
import java.util.ArrayList;

public class ShoppingReceipt {
    private ArrayList<Product> items;
    private double tax;
    private double total;
    private double subTotal;

    public ShoppingReceipt (double subTotal, double tax, double total, ArrayList<Product> items) {
        this.items = items;
        this.tax = tax;
        this.total = total;
        this.subTotal = subTotal;
    }

    public double getSubTotal () {
        return subTotal;
    }

    public double getTax () {
        return tax;
    }

    public double getTotal () {
        return total;
    }

    public ArrayList<Product> getItems () {
        return items;
    }

    @Override
    public String toString () {
        String receipt = "item              price              qty\n\n";
        int priceIndex = receipt.indexOf("price");
        int qtyIndex = receipt.indexOf("qty");

        for (Product product : this.items) {
            String itemAndPrice = product.getProductName()
                    + StringHelper.ensureSpace(priceIndex, product.getProductName()) + "$" + String.format("%.2f", product.getUnitPrice());

            receipt += itemAndPrice + StringHelper.ensureSpace(qtyIndex + 2, itemAndPrice) + product.getQuantity() + "\n";
        }

        String formatSubTotal = String.format("%.2f", subTotal);
        String formatTax = String.format("%.2f", tax);
        String formatTotal = String.format("%.2f", total);

        receipt += "subtotal:" + StringHelper.ensureSpace(qtyIndex + 2 - String.valueOf(formatSubTotal).length(), "subtotal:") + "$" + formatSubTotal + "\n"
                + "tax:" + StringHelper.ensureSpace(qtyIndex + 2 - String.valueOf(formatTax).length(), "tax:") + "$" + formatTax + "\n"
                + "total:" + StringHelper.ensureSpace(qtyIndex + 2 - String.valueOf(formatTotal).length(), "total:") + "$" + formatTotal;

        return receipt;
    }
}
