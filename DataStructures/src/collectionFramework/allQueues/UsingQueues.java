package collectionFramework.allQueues;

import java.util.PriorityQueue;
import java.util.Queue;

public class UsingQueues {
    //As the name suggests, a queue interface maintains the FIFO(First In First Out) order similar to a real-world queue line.
    //This interface is dedicated to storing all the elements where the order of the elements matter.

    // Therefore, the person whose request arrives first into the queue gets the ticket.
    // There are various classes like PriorityQueue, ArrayDeque, etc. Since all these subclasses implement the queue, we can instantiate a queue object with any of these classes.
    public static void main(String[] args){
        //A PriorityQueue is used when the objects are supposed to be processed based on priority.
        // It is known that a queue follows the First-In-First-Out algorithm, but sometimes the elements of the queue are needed to be processed according to the priority and this class is used in these cases.
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i = 1; i < 30 ; i+=3) priorityQueue.add(i);

        //printing the top element
        System.out.println("head of queue" + priorityQueue.peek());

        System.out.println("poll() method: "+priorityQueue.poll());

        System.out.println("New head of queue after removal" + priorityQueue.peek());
    }
}
