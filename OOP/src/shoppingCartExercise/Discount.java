package shoppingCartExercise;

public class Discount {

    private String discountName;
    private int discountRate;

    public Discount(String discountName, int discountRate) {
        this.discountName = discountName;
        this.discountRate = discountRate;
    }

    public String getDiscountName() {
        return discountName;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }
}
