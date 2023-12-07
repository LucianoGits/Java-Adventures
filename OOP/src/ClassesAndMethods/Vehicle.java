package ClassesAndMethods;

public class Vehicle {
    protected int passengers,fuelCap, mpg;

    //constructors
    public Vehicle() {
    }

    public Vehicle(int passengers, int fuelCap, int mpg) {
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.mpg = mpg;
    }
    //custom methods

    private int range(){
        return fuelCap * mpg;
    }
    public String capacity(){
        return "Can carry a total of " + passengers + " with a range of " + range() + " .";
    }
    public double fuelNeeded(int miles){
        return (double) miles/mpg;
    }

    //getter and setters

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelCap() {
        return fuelCap;
    }

    public void setFuelCap(int fuelCap) {
        this.fuelCap = fuelCap;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }
}
