package arrays;

public class ArraysOverview {
    public static void main(String[] args ){
        ArrayBasics arrayBasics = new ArrayBasics();
        arrayBasics.intro();
        arrayBasics.loopingArr();

        int[] arr = {123,-456,3,234,2,4,6};
        SortingAnArray sortingAnArray = new SortingAnArray(arr);
        sortingAnArray.sortArray();

        TwoDArrays twoDArrays = new TwoDArrays();
        twoDArrays.loadTwoDimensional();
    }
}
