package model;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingReceiptTest {
    @Test
    public void testShoppingReceipt1() {
        Product p1 = new Product("book", 17.99, 1, "NY");
        Product p2 = new Product("pencil", 2.99, 3, "NY");

        ArrayList<Product> products = new ArrayList<Product>(Arrays.asList(p1, p2)) {};

        ShoppingReceipt sr = new ShoppingReceipt(26.96, 2.40, 29.36, products);

        Assert.assertEquals(String.valueOf(26.96), String.valueOf(sr.getSubTotal()));
        Assert.assertEquals(String.valueOf(2.40), String.valueOf(sr.getTax()));
        Assert.assertEquals(String.valueOf(29.36), String.valueOf(sr.getTotal()));

        ArrayList<Product> tmp = sr.getItems();
        for (int i = 0; i < sr.getItems().size(); i++) {
            Assert.assertEquals(products.get(i).getProductName(), tmp.get(i).getProductName());
            Assert.assertEquals(String.valueOf(products.get(i).getUnitPrice()), String.valueOf(tmp.get(i).getUnitPrice()));
            Assert.assertEquals(products.get(i).getQuantity(), tmp.get(i).getQuantity());
            Assert.assertEquals(products.get(i).getPurchaseLocation(), tmp.get(i).getPurchaseLocation());
        }
    }
}
