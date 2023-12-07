package intro;

public class RunMultipleTypeParameters {
    public static void main(String[] args){
        OrderedPair<String, String> orderedPair = new OrderedPair<>("Name", "Luciano");
        OrderedPair<Integer, Box<String>> orderedPairWithGenericClass= new OrderedPair<>(1, new Box<>());
        System.out.println(orderedPair.toString());
        System.out.println(orderedPairWithGenericClass.toString());
    }
}
