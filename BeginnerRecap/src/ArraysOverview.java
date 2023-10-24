public class ArraysOverview {
    public static void main(String[] args ){
        // ways of declaring arrays and array declaration also depends on variable type
        // unlike most languages, array size in Java is fixed

        int[] arr; // more readable
        arr = new int[10];
        System.out.println("java style array: " +arr[0]);

        int arr2[]; //initializing a C-style array

        int[] arr3 = {1,2,3};
        System.out.println("declaring array: " +arr3[2]); //use index to access array value e.g arr[1] etc..

        double [] arr4 = new double[10];
        System.out.println("double array: " +arr4[0]);

        boolean[] arr5 = new boolean[10];
        System.out.println("boolean: " +arr5[0]);

        int[][] matrix = {{1,2,3},{4,5,6}}; // use double square brackets to declare multidimensional
        System.out.println("multidimensional arrays (array of arrays): " + matrix[1][2]);


    }
}
