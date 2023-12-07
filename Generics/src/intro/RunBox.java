package intro;
import java.util.Arrays;


public class RunBox {
    public static void main(String[] args){
        Box<String> box = new Box<>();
        int[] Numbs = {1, 2};
        String[] names = {"Luciano", "John"};

        box.setT(names[0]);
        System.out.println(box.getT());

    }
}
