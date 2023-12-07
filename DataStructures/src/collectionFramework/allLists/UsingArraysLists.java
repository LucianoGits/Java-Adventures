package collectionFramework.allLists;


import java.util.*;

public class UsingArraysLists {
    public static  void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Luciano");
        names.add("Johny");
        names.add("Billy");

        System.out.println("=============== Sorting ============");
        System.out.println("Element at position [0]:" + names.get(0));
        System.out.println();
        System.out.println("before sorting: "+names.toString());
        //sorting arraylist
        Collections.sort(names);
        System.out.println("After sorting: " + names.toString());

        System.out.println("=============== For Looping ============");
        //for looping ArrayLists
        for(String name : names ){
            System.out.println(name);
        }
        System.out.println("=============== While Looping ============");
        //while loop
        Iterator<String> itr = names.iterator();
        while(itr.hasNext()) System.out.println(itr.next());

        System.out.println("=============== data manipulation ============");
        System.out.println("Before changing value at position[1]: " + names.toString());
        names.set(1,"Mary");
        System.out.println("After changing value at position[1]: " + names.toString());



    }
}
