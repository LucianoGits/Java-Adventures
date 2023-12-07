package Enumerations;

public class RunDemo {
    public static void main(String[] args) {
       //printing values of Enum values
        Color red = Color.RED;
        System.out.println("name: " + red.name());
        for(Color color: Color.values()){
            System.out.println("Enum Value: " + color.getValue());
        }
    }
}
