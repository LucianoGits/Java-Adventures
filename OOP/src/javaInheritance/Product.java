package javaInheritance;

public class Product {
    private int id;
    private String name;

    public Product() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int calculateRemainingAmount(){
        return 100;
    }

    public Product[] listVariants(){
        return  new Product[3];
    }
}
