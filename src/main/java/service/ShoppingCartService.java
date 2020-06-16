//package service;
//
//import model.Product;
//import model.ShoppingCart;
//
//import java.util.ArrayList;
//
//public class ShoppingCartService {
//    private ShoppingCart sc;
//
//    public ShoppingCartService (ShoppingCart sc) {
//        this.sc = sc;
//    }
//
//    public void addTax(double tax) {
//        this.sc.setTotalPaidTax(this.sc.getTotalPaidTax() + tax);
//    }
//
//    public ArrayList<Product> getProducts () {
//        return this.sc.getProducts();
//    }
//
//    public void addProductToCart (Product product) {
//        this.sc.getProducts().add(product);
//    }
//}
