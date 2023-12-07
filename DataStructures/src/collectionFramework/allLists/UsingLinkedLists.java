package collectionFramework.allLists;

import java.util.LinkedList;
import java.util.List;

public class UsingLinkedLists {
    public static void main(String[] args){
        //declaring linked list
        LinkedList<Integer> linkedList = new LinkedList<>();
        //LinkedList<Integer> linkedList = new LinkedList<>();

        //appending to linked lists
        for(int i = 1; i < 21; i+=2) linkedList.add(i);

        //printing elements
        System.out.println(linkedList);

        //removing
        linkedList.remove(0);

        //printing elements 1 by 1
        for(int i = 0; i <linkedList.size(); i++) System.out.println(linkedList.get(i) + " ");


    }

}
