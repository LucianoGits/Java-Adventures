package javaInterfaces.introToInterfaces;

public class ThePrey implements Prey{
    private final String nameOfPrey;

    public ThePrey(String nameOfPrey) {
        this.nameOfPrey = nameOfPrey;
    }

    @Override
    public void flee() {
        System.out.println("The "+nameOfPrey+" is running away from predator");
    }
}

