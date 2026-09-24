import java.util.Queue;
import java.util.LinkedList;

public class QueueExample1{
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue: "+ queue);
        queue.remove();
        System.out.println("After remove:"+ queue);
        System.out.println("Front: "+ queue.peek());
    }
}