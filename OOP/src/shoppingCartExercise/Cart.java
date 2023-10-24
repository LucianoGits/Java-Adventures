package shoppingCartExercise;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Cart {
    private static final int DEFAULT_CART_CAPACITY = 10;
    private static final int MONEY_SCALE = 2;
    private static final double DEFAULT_TAX_RATE = 0.15;
    private static final String DEFAULT_TAX_TYPE = "incomeTax";
    private static final int DEFAULT_DISCOUNT_RATE = 0;
    private static final String DEFAULT_DISCOUNT_NAME = "zeroDiscount";

    private static int cartCounter;

    private int id,userId, indexToAddNewProduct;
    private BigDecimal totalNetPrice, totalGrossPrice, totalTax;
    private Tax tax;
    private Product[] products;

    private Discount discount;

    static {
        System.out.println("shoppingcart.Cart.class uploaded into JVM");
    }
    {
        cartCounter++;
        userId=1;
        tax = new Tax(DEFAULT_TAX_TYPE,DEFAULT_TAX_RATE);
        discount = new Discount(DEFAULT_DISCOUNT_NAME,DEFAULT_DISCOUNT_RATE);
    }

    public Cart() {
    }

    public Cart(int id, int userId) {
        this.id = id;
        this.userId = userId;
    }

    public void addProduct(Product product){
        if(product == null){
            return;
        }
        if(products == null){
            products = new Product[DEFAULT_CART_CAPACITY];
        }

        if(products.length < indexToAddNewProduct +1){
            products = Arrays.copyOf(products, products.length << 1);
        }
        products[indexToAddNewProduct++] = product;
        calculateTotalNetPrice();
        calculateTotalGrossPrice();

    }

    private BigDecimal calculateTotalNetPrice() {
        this.totalNetPrice = BigDecimal.valueOf(Arrays.stream(this.products)
                .mapToDouble(product -> product != null ? product.getPrice()
                        .doubleValue(): 0).sum()).setScale(MONEY_SCALE, RoundingMode.HALF_UP);
        return this.totalNetPrice;
    }

    private BigDecimal calculateTotalGrossPrice() {
        if(this.totalNetPrice.doubleValue() < 0){
            calculateTotalNetPrice();
        }

        BigDecimal orderDiscount = this.totalNetPrice
                .multiply(BigDecimal.valueOf(discount.getDiscountRate()))
                .setScale(MONEY_SCALE, RoundingMode.HALF_UP);
        this.totalTax = this.totalNetPrice.multiply(BigDecimal.valueOf(tax.getTaxRate()))
                .setScale(MONEY_SCALE, RoundingMode.HALF_UP);
        this.totalGrossPrice = this.totalNetPrice.add(this.totalTax).subtract(orderDiscount);
        return this.totalGrossPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getIndexToAddNewProduct() {
        return indexToAddNewProduct;
    }

    public void setIndexToAddNewProduct(int indexToAddNewProduct) {
        this.indexToAddNewProduct = indexToAddNewProduct;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
