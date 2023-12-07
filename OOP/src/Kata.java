import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kata {
    public static void main(String[] args){
        System.out.println(Kata.solution("Hello", "Hsello"));
        System.out.println(filterList(Arrays.asList(12,22, "Hello")));

    }
    public static boolean solution(String str, String ending) {
        return str.length() >= ending.length() && str.endsWith(ending);
    }
    public static List<Object> filterList(final List<Object> list) {
        List<Object> newList = new ArrayList<>();
        for(int i =0 ; i < list.size(); i++){
                if(list.get(i) instanceof Integer){
                    newList.add(list.get(i));
                }
        }

        return newList;
    }
}
