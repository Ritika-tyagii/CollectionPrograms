import java.util.LinkedList;
import java.util.Queue;

public class QueueLeacture{
    public static void main(String[] args) {
        Queue <String> q= new LinkedList<>();
q.add("A");
q.add("B");
q.add("C");
System.out.println(q);
System.out.println(q.peek());
System.out.println(q.poll());
System.out.println(q);
q.offer("D");
System.out.println(q);
    }
}