package JavaCollections.Queue;

import java.util.Queue;

public class Fifo {
    public static void main(String[] args) {
        Queue<Integer> q=new Queue<>();
        q.offer(10);
        q.offer(20);
        System.out.println("Peek: "+q.peek()); // Peek returns the head element
        q.poll(); // Poll removes and returns the head element
        System.out.println("After poll: "+q); // Queue after removing head element
        q.isEmpty();
        System.out.println("After isEmpty: "+q.isEmpty()); // Checking if queue is empty
        for(int e:q){
            System.out.println(e); // Printing all elements in the queue
        }
        
        
    }
    
}
