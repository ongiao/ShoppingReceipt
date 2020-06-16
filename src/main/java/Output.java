import config.Resources;
import model.Product;
import model.ShoppingCart;
import model.ShoppingReceipt;
import service.CalculateReceiptService;
import util.impl.ShoppingReceiptPrinter;
import util.impl.FileReader;

public class Output {

    // Process input string and init ShoppingCart instance with product's information
    private static ShoppingCart processInputAndInitShoppingCart(String input) {
        String[] splitStr = input.split(",");
        String location = splitStr[0].split(":")[1].trim();

        ShoppingCart shoppingCart = new ShoppingCart();

        for (int i = 1; i < splitStr.length; i++) {
            String productInfo = splitStr[i];
            String[] infoArray = productInfo.split(" at ");
            String productAndQuantity = infoArray[0].trim();

            int quantity = Integer.valueOf(productAndQuantity.substring(0, productAndQuantity.indexOf(" ")));
            String productName = productAndQuantity.substring(productAndQuantity.indexOf(" ") + 1);
            double price = Double.valueOf(infoArray[1]);

            Product product = new Product(productName, price, quantity, location);
            shoppingCart.addProductToCart(product);
        }

        return shoppingCart;
    }

    public static void main (String[] args) {
        FileReader fileReader;
        ShoppingReceiptPrinter shoppingReceiptPrinter;

        try {
            fileReader = new FileReader(Resources.INPUT_FILE_PATH);

            String input = fileReader.readLine();

            while (!input.equals("")) {
                ShoppingCart shoppingCart = processInputAndInitShoppingCart(input);

                CalculateReceiptService calculateReceiptService = new CalculateReceiptService(shoppingCart);
                double subTotal = calculateReceiptService.calculateSubTotal();
                double total = calculateReceiptService.calculateTotal();
                double totalPaidTax = shoppingCart.getTotalPaidTax();

                ShoppingReceipt sr = new ShoppingReceipt(subTotal, totalPaidTax, total, shoppingCart.getProducts());

                shoppingReceiptPrinter = new ShoppingReceiptPrinter(sr);
                shoppingReceiptPrinter.print();

                input = fileReader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
