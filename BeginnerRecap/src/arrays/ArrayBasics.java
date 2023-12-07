package arrays;


public class ArrayBasics {
    // ways of declaring arrays and array declaration also depends on variable type
    // unlike most languages, array size in Java is fixed

   public void intro(){
       System.out.println("---- intro to arrays ----");

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

    public void loopingArr(){
        System.out.println("---- looping arrays ----");

        int sample[] = new int[10];
        sample[0] = 9954;
        sample[1] = 123;
        sample[2] = -345;
        sample[3] = 3343;
        sample[4] = 12;
        sample[5] = 1;
        sample[6] = 0;
        sample[7] = -1000;
        sample[8] = 765;
        sample[9] = 456;

        // finding max and min

        int min,max;
        min = max = 0;

        for(int i = 0; i <sample.length; i++){
            if(sample[i] > min) min = sample[i];
            if(sample[i] < max) max = sample[i];
        }
        System.out.println("MIN: " + min + " || MAX: " + max);

    }
}
