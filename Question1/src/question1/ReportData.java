package question1;
import java.util.ArrayList;

public class ReportData extends Products {

    //get and set methods for product code
    //Java Programming - Joyce Farrell
    public static ArrayList<String> getProductCode() {
        return ProductCode;
    }

    public static void setProductCode(ArrayList<String> ProductCode) {
        Products.ProductCode = ProductCode;
    }
    
    //get and set methods for product name
    public static ArrayList<String> getProductName() {
        return ProductName;
    }

    public static void setProductName(ArrayList<String> ProductName) {
        Products.ProductName = ProductName;
    }

       //get and set methods for product category
    public static ArrayList<String> getProductCategory() {
        return ProductCategory;
    }

    public static void setProductCategory(ArrayList<String> ProductCategory) {
        Products.ProductCategory = ProductCategory;
    }

    //get and set methods for product warranty
    public static ArrayList<String> getProductWarranty() {
        return ProductWarranty;
    }

    public static void setProductWarranty(ArrayList<String> ProductWarranty) {
        Products.ProductWarranty = ProductWarranty;
    }

    //get and set methods for product price
    public static ArrayList<Integer> getProductPrice() {
        return ProductPrice;
    }

    public static void setProductPrice(ArrayList<Integer> ProductPrice) {
        Products.ProductPrice = ProductPrice;
    }

    //get and set methods for product stock level
    public static ArrayList<Integer> getProductStockLevel() {
        return ProductStockLevel;
    }

    public static void setProductStockLevel(ArrayList<Integer> ProductStockLevel) {
        Products.ProductStockLevel = ProductStockLevel;
    }

    //get and set methods for product supplier
    public static ArrayList<String> getProductSupplier() {
        return ProductSupplier;
    }

    public static void setProductSupplier(ArrayList<String> ProductSupplier) {
        Products.ProductSupplier = ProductSupplier;
    }
}
