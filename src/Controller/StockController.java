package Controller;import Model.Product;import Model.ProductImpl;import View.StockDisplay;import java.util.ArrayList;public class StockController {    ProductImpl pi = new ProductImpl();    StockDisplay sd = new StockDisplay();    public void getProducts(){        ArrayList<Product> list = pi.get();        sd.showProducts(list);    }}