package classes.class8;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        // MIN heap -> priority will be more of lesser value / minimum value
        // MAX heap -> priority will be more of greater value / maximum value
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(20);
        pq.offer(100);
        pq.offer(40);
        pq.offer(-100);
        pq.offer(60);
        
        System.out.println(pq);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
