package classes.class7;

import java.util.ArrayDeque;

public class QueueClass {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(100);
        queue.offer(200);
        queue.offer(300);
        // [100, 200, 300, 400]
        queue.add(400);
        // [500, 100, 200, 300, 400, 700]
        queue.addFirst(500);
        queue.addLast(700);
        Integer removedObject = queue.removeFirst();
        System.out.println("Removed object : " + removedObject);
        System.out.println(queue);
        queue.remove(200);
        System.out.println(queue);

        System.out.println(queue);
    }
}
