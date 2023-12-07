package javaInterfaces.introToInterfaces;

public class RunInterfaces {
    public static void main(String[] args){
        //interfaces can be described as a template that can be applied to a class.
        //similar to inheritance, but specifies what class has/must do.
        //classes can apply more than  one interface and inheritance is limited to 1 superclass

        ThePrey thePrey = new ThePrey("rabbit");
        thePrey.flee();
        Hunter hunter = new Hunter("lion");
        hunter.hunt();
    }
}
