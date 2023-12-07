package javaInheritance;

public class RunInheritance {
    public static void main(String[] args){
        Product product = new Phone();
        product.setName("Iphone 14");
        System.out.println("Product name: " + product.getName());

        Phone phone2 = new Phone();
        phone2.ring();

        Phone phone3 = (Phone) product;
        phone3.ring();

        System.out.println(phone3.calculateAmountOfVariants());
    }
}
