package collectionFramework.allQueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class UsingDeque {

//    This is a very slight variation of the queue data structure.
//    Deque, also known as a double-ended queue, is a data structure where we can add and remove elements from both ends of the queue.
//    This interface extends the queue interface.
//    The class which implements this interface is ArrayDeque.
//    Since ArrayDeque class implements the Deque interface, we can instantiate a deque object with this class.
    public static  void main(String[] args){
        //declaring deque
        Deque<Integer> deque = new ArrayDeque<Integer>(10);

        //adding to deque
        for(int i = 0; i < 10 ; i+=2) deque.add(i);
        System.out.println("original deque: "+deque);

        //clear method
        deque.clear();
        System.out.println("deque after using the clear() method: "+deque);

        deque.add(20);
        deque.addFirst(21);
        deque.addLast(1);

        System.out.println("new deque after deque.addFirst(21),deque.addLast(1): "+deque);

    }

}
