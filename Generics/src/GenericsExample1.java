public class GenericsExample1 {

    public static void main(String[] args){
        String[] strings = {"one", "two","three"};
        Integer[] ints = {1,2,3};

        printArray(strings);
        printArray(ints);



    }
//    static void printArray(String[] strings){
//        for(String string:strings) System.out.println("Element: " + string);
//    } // // only works for String

    static <E> void printArray(E[] arr){
        for(E element:arr) System.out.println("Element: " + element);
    } //works for every Type (use the class, e.g. int type won't work but Integer[] will work)

}
