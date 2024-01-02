//JCF Provide Min Heap Implementation of PQ
import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Collections;
public class Main {
public static void main(String[] args) {
    PriorityQueue<>pq=new PriorityQueue<>(Collections.reverseOrder());
    
    //Add element to pq
    pq.offer(0);
    pq.offer(1);
    pq.offer(3);
    pq.offer(6);
    pq.offer(1);
    
    // to get head of pq
    // System.out.println(pq.peek());

    // //to remove element from pq
    // pq.poll();

    // //to get size of pq
    // pq.size();

    // //To search an element
    // System.out.println(pq.contains(1));

    // //to remove particular element
    // System.out.println(pq.remove(3));

    System.out.println(pq);
}   
}