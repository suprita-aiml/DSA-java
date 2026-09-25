import java.util.LinkedList;
public class Node{
    public static void main(String[] args){
        LinkedList <String> linkedList=new LinkedList<String>();

        /*Stack as a linkedList
        linkedList.push("Apple");
        linkedList.push("Banana");
        linkedList.push("Mango");
        linkedList.push("Cherry");
        linkedList.push("Greps");

        System.out.println("linked list:" +linkedList);
        linkedList.pop();
        System.out.println("linked list after popping:" +linkedList);

        System.out.println(" In linked list first fruit :" +linkedList.peek());
         */
        //Queue as a linkedList
        linkedList.offer("Cat");
        linkedList.offer("Dog");
        linkedList.offer("Cow");
        linkedList.offer("Fox");
        linkedList.offer("Lion");

        System.out.println("linked list:" +linkedList);
        linkedList.poll();
        System.out.println("linked list after removing a animal :" +linkedList);

        System.out.println("First animal of linkedList is:"+linkedList.peek());

    }

}