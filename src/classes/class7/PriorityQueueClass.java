package classes.class7;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(100); // hardly coupled code
        queue.offer(200); // loosely coupled code

        if (queue instanceof ArrayDeque) {
            ArrayDeque<Integer> aq = (ArrayDeque<Integer>) queue; // is Valid???
            aq.addFirst(300);
        } else if (queue instanceof LinkedList) {
            LinkedList<Integer> aq = (LinkedList<Integer>) queue;
            aq.addFirst(500);
        }

        System.out.println(queue);
    }
}
