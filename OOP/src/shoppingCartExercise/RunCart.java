package shoppingCartExercise;

import java.math.BigDecimal;

public class RunCart {
    public static void main (String ...args){
        Cart cart = new Cart(1,2);
        Product product = new Product("Ferrari 4040", BigDecimal.valueOf(500));
        cart.addProduct(product);
        System.out.println(cart.toString());
    }
}
