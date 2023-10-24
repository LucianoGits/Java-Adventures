import java.util.Arrays;

public class Enumerations {
    public static void main(String[] args){
        Priority priority = Priority.MEDIUM;
        Month[] months = Month.values();

        switch(priority){
            case HIGH -> System.out.println("High priority");
            case MEDIUM -> System.out.println("Medium priority");
            case LOW -> System.out.println("Low priority");
        }
        System.out.println(Arrays.toString(months));

        for(Month month : months ){
            System.out.println(month + " has " + month.getDaysInMonth() + " days.");
        }



    }
}
