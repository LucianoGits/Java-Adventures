package theStatic;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        User user1 = new User();
        System.out.println("user1.getId() = " + user1.getId());
        System.out.println("user1.getCounter() = " + user1.getCounter());

        User user2 = new User();
        System.out.println("user2.getId() = " + user2.getId());
        System.out.println("user2.getCounter() = " + user2.getCounter());

        System.out.println("======================================");
        System.out.println();

        User.doStaticAction();
        Employee.doStaticAction();
        System.out.println("======================================");
        System.out.println();

        User employee = new Employee();
        System.out.println(employee.getCounter());
        int[] arr = {1,2,3};
        Arrays.sort(arr);

    }
}
