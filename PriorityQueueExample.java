import java.util.PriorityQueue;

public class PriorityQueueExample{
    public static void main(String[] args){

        PriorityQueue<Integer>queue=new PriorityQueue<>();

        queue.add(30);
        queue.add(10);
        queue.add(50);

        System.out.println("PriorityQueue: " + queue);
        System.out.println("HighestPriority: "+ queue.peek());

        queue.remove();
        System.out.println("After Remove: "+ queue);
    }
}