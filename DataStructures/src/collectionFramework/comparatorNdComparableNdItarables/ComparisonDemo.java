package collectionFramework.comparatorNdComparableNdItarables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparisonDemo {
    public static void main(String[] args) {
        // Sorting Integers (type that implements Comparable)
        System.out.println("========= Integers ========");

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,24,34,211,3));
        System.out.println("Original list: " + integerList);

        integerList.sort(Comparator.naturalOrder());
        System.out.println("Natural Order: " + integerList);

        integerList.sort(Comparator.reverseOrder());
        System.out.println("Reversed Order: " + integerList);

        System.out.println("========= Products ========");

    }
}
