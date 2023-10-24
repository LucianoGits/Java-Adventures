package shoppingCartExercise;

public class Tax {
    private String taxType;
    private double taxRate;

    public Tax(String taxType, double taxRate) {
        this.taxType = taxType;
        this.taxRate = taxRate;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
}
