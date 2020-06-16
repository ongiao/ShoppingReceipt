package model;

import org.junit.Assert;
import org.junit.Test;

public class ProductTest {
    @Test
    public void testProduct() {
        Product product = new Product("book", 17.99, 1, "CA");

        Assert.assertEquals("book", product.getProductName());
        Assert.assertEquals(String.valueOf(17.99), String.valueOf(product.getUnitPrice()));
        Assert.assertEquals(1, product.getQuantity());
        Assert.assertEquals("CA", product.getPurchaseLocation());
    }
}
