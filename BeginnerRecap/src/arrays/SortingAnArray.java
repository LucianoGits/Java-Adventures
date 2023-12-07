package arrays;

public class SortingAnArray {
    private final int[] anArr;
    private int a, b, temp;
    public SortingAnArray(int[] anArr) {
        this.anArr = anArr;
    }

    //methods

    protected void sortArray(){
        System.out.println("---- Sorting arrays using bubble sort ----");
        System.out.print("OriginalArray is: ");

        for(int i =0; i < anArr.length; i++){
            System.out.print(" " + anArr[i]);
        }
        System.out.println();

        bubbleSort();

        System.out.print("sorted Array: ");

        for(int i =0; i < anArr.length; i++){
            System.out.print(" " + anArr[i]);
        }
        System.out.println();

    }
    private  void bubbleSort(){
        for(a = 0; a < anArr.length; a++){

            for(b = anArr.length - 1; b > a ;b--){
                if(anArr[b - 1] > anArr[b]){
                    //exchange elements
                    temp = anArr[b - 1];

                    anArr[b - 1] = anArr[b];
                    anArr[b] = temp;

                }
            }
        }
    }

}
