package shoppingCartExercise;

import java.util.Arrays;

public class User {
    public static final int DISCOUNT_THRESHOLD_USD = 1000;
    public static final double FIVE_PERCENT_DISCOUNT = 0.05;
    private String fName,lName, email;
    private Product[] products;

    private double calculateDiscount(){
        double totalPriceAllProductsBought = Arrays.stream(products)
                .map(product -> product.getPrice())
                .mapToDouble(price -> price.doubleValue()).sum();
        if(totalPriceAllProductsBought >= DISCOUNT_THRESHOLD_USD) return FIVE_PERCENT_DISCOUNT;
        return 0;
    }

    //getters and setters

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
