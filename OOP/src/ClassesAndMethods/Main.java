package ClassesAndMethods;

public class Main {
    public static void main(String[] args){
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle ferrari488 = new Vehicle(2,78,28);
        Vehicle toyota;
        toyota = new Vehicle(2,4,5);
        System.out.println("Minivan: " + minivan.capacity());
        System.out.println("Ferrari 488: " + ferrari488.capacity());
        System.out.println("Toyota: " + toyota.capacity());



    }
}
