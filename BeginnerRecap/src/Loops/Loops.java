package Loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        System.out.println("-------for loops--------");
        for(int i = 0; i <= 5; i++ ){
            System.out.println("Counter: " + i);
        }

        System.out.println("-------reverse counter--------");
        for(int i = 5; i >= 0; i-- ){
            System.out.println("Counter: " + i);
        }

        System.out.println("-------double counters--------");
        for(int i = 0, j = 10; i < j; i++, j-- ){
            System.out.println("Counter i: " + i + " | Counter j: " + j);
        }

        System.out.println("-------forEach loops--------");
        int[] arr = {1,2,3};
        int sum = 0;

        for(int num : arr){
            sum+=num;
            System.out.println("Number: " + sum);

        }

        System.out.println("------- nested loops --------");

        int size = 5;

        //square pattern
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }

        // right triangle
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Inverted Pyramid
        for (int i = size; i > 0; i--) {
            for (int j = 0; j < size - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //printing multi-dimensional array values
        int[][] matrix = {
                {1, 2, 3, 4, 5,},
                {6, 7},
                {8, 9, 10}
        };
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

        System.out.println("------- using input in loops --------");

        System.out.print("Please, enter any integer: ");

        Scanner scanner = new Scanner(System.in);
        String strInput = scanner.nextLine();
        for(int i = 0; i < strInput.length(); i++){
            System.out.println(strInput.charAt(i));
        }



    }
}
