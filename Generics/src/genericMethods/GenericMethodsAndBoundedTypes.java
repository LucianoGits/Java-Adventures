package genericMethods;

public class GenericMethodsAndBoundedTypes {
    public static void main(String[] args) {
        System.out.println(countGreaterThan(new Integer[]{1, 2, 3, 4, 5}, 1));
    }
    // Consider the following method that counts the number of elements in an array T[] that are greater than a specified element elem.

//    public static  <T> int countGreaterThen(T[] anArray, T elem){
//        int count = 0;
//        for(T e : anArray)
//            if(e > elem) ++count;
//
//        return count;
//    } //// --> this will not work because not compile because the greater than operator (>) applies only to primitive types such as short, int, double, long, float, byte, and char.
    ////You cannot use the > operator to compare objects.

    //here is how it can work:
    public static <T extends Comparable<T>>int countGreaterThan(T[] anArray, T elem){
        int count = 0;
        for(T e : anArray)
            if(e.compareTo(elem) > 0) ++count;

        return count;
    }
}
