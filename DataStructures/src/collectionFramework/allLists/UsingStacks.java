package collectionFramework.allLists;

import java.util.Iterator;
import java.util.Stack;

public class UsingStacks {
    //Stack class models and implements the Stack data structure. The class is based on the basic principle of Last-in-first-out.
    // In addition to the basic push and pop operations, the class provides three more functions empty, search, and peek.
    // The class can also be referred to as the subclass of Vector.

    //LAST IN - FIRST OUT
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        stack.push("Luciano");
        stack.push("Johny");
        stack.push("Hilly");
        stack.push("Billy");
        System.out.println(stack);

        //iterator for while loop for stack
        Iterator<String> iteratorForStack = stack.iterator();
        while(iteratorForStack.hasNext()) System.out.print(iteratorForStack.next() + ", ");

    }
}
