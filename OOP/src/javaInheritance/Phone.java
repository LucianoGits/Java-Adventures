package javaInheritance;

public class Phone extends Product{
    public Phone() {
        super();
    }
    public void ring(){
        System.out.println("Ring Ring Ring!!!");
    }

    @Override
    public Product[] listVariants() {
        throw new UnsupportedOperationException();
    }

    public int calculateAmountOfVariants(){
        return super.listVariants().length;
    }
}
