package model;

import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartTest {
    @Test
    public void testShoppingCart() {
        ShoppingCart sc = new ShoppingCart();

        sc.addProductToCart(new Product("book", 17.99, 1, "CA"));
        sc.addProductToCart(new Product("potato chips", 3.99, 1, "CA"));

        Assert.assertEquals("book", sc.getProducts().get(0).getProductName());
        Assert.assertEquals(String.valueOf(17.99), String.valueOf(sc.getProducts().get(0).getUnitPrice()));
        Assert.assertEquals(1, sc.getProducts().get(0).getQuantity());
        Assert.assertEquals("CA", sc.getProducts().get(0).getPurchaseLocation());

        Assert.assertEquals("potato chips", sc.getProducts().get(1).getProductName());
        Assert.assertEquals(String.valueOf(3.99), String.valueOf(sc.getProducts().get(1).getUnitPrice()));
        Assert.assertEquals(1, sc.getProducts().get(1).getQuantity());
        Assert.assertEquals("CA", sc.getProducts().get(1).getPurchaseLocation());
    }
}
