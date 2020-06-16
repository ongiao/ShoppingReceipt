package util.impl;

import model.ShoppingReceipt;
import util.IPrinter;

public class ShoppingReceiptPrinter implements IPrinter {
    private ShoppingReceipt sr;

    public ShoppingReceiptPrinter (ShoppingReceipt sr) {
        this.sr = sr;
    }

    public void print () {
        System.out.println(this.sr.toString());
        System.out.println();
    }
}
