package service;

import model.Product;
import model.ShoppingCart;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class TestCartService {
    @Test
    public void testCartService() throws IOException {
        Product p1 = new Product("book", 17.99, 1, "NY");
        Product p2 = new Product("pencil", 2.99, 3, "NY");
        ArrayList<Product> products = new ArrayList<Product>(Arrays.asList(p1, p2)) {};

        ShoppingCart sc = new ShoppingCart();
        sc.addProductToCart(p1);
        sc.addProductToCart(p2);

        CalculateReceiptService cartService = new CalculateReceiptService(sc);

        double[] expectedTaxes = new double[] {1.6, 0.8};
        double expectedSubTotal = 26.96;
        double expectedTotal = 29.36;
        ArrayList<Product> tmp = cartService.getCart().getProducts();

        for (int i = 0; i < tmp.size(); i++) {
            double exoectedTax = expectedTaxes[i];
            double gotTax = cartService.calculateTax(tmp.get(i));

            double gotSubTotal = cartService.calculateSubTotal();
            double gotTotal = cartService.calculateTotal();

            Assert.assertEquals(String.valueOf(exoectedTax), String.valueOf(gotTax));
            Assert.assertEquals(String.valueOf(expectedSubTotal), String.valueOf(gotSubTotal));
            Assert.assertEquals(String.valueOf(expectedTotal), String.valueOf(gotTotal));
        }
    }
}
