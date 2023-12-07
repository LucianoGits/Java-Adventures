package javaInterfaces.introToInterfaces;

public class Hunter implements Predator{
    private final String predatorName;
    @Override
    public void hunt() {
        System.out.println("the " + predatorName + " is hunting." );
    }

    public Hunter(String predatorName) {
        this.predatorName = predatorName;
    }

}
