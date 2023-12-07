package org.lndev;

@FunctionalInterface
public interface DistanceCalculator {
    double CalculateDistance(City city1, City city2); //abstract method

    //Functional Interfaces only allow one abstract method
//    double CalculateSomething(int one, int two); //uncomment and the @FunctionalInterface will be flagged
    default void someDefaultMethod(){};
    default void someStaticMethod() {}
}
