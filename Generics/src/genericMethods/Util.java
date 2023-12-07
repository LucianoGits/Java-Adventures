package genericMethods;

import intro.OrderedPair;
import intro.Pair;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Util {
    public static void main(String[] args) {
        OrderedPair<Integer, String> pair1 = new OrderedPair<>(1, "Billy");
        OrderedPair<Integer, String> pair2 = new OrderedPair<>(2, "Goat");
        Pair<String, Date> todayDate = new OrderedPair<>("Today's Date(Using custom Pair and OrderedPair)", new Date());

        Map<String, Date> todayDateV2 = new HashMap<>();
        todayDateV2.put("Today's Date (Using Map and HashMap)",new Date());


        System.out.println(todayDate.toString());
        System.out.println(todayDateV2.entrySet());
        System.out.println(compare(pair1,pair1)); //true
        System.out.println(compare(pair1,pair2)); //false
    }
    //generic method
    public static <K,V> boolean compare(Pair<K, V> pair1, Pair<K,V> pair2){
        return pair1.getKey().equals(pair2.getKey()) &&
                pair1.getValue().equals(pair2.getValue());
    }
}
