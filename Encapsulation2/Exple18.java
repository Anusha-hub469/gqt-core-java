package Encapsulation2;
class Product {
    private String productName;
    private int productCode;
    private int quantity;
    void setDetails(String productName, int productCode, int quantity) {
        this.productName = productName;
        this.productCode = productCode;
        this.quantity = quantity;
    }
    void showDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Code: " + productCode);
        System.out.println("Quantity: " + quantity);
    }
}
public class Exple18 {
    public static void main(String[] args) {
        Product firstProduct = new Product();
        firstProduct.setDetails("Laptop", 501, 20);
        firstProduct.showDetails();
    }
}
