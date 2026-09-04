import java.util.ArrayDeque;
import java.util.Deque;
public class DequeTask {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.addLast("f");
        dq.addLast("g");
        dq.addLast("h");
        dq.addLast("E");
          System.out.println("Customers: " + dq);
  System.out.println("Last Customer: " + dq.peekLast());
        System.out.println("First Customer: " + dq.peekFirst());
         dq.addFirst("A");
        dq.addFirst("B");
        dq.addFirst("C");
        dq.addFirst("D"); 
        System.out.println("Customers: " + dq);
        System.out.println("Last Customer: " + dq.peekLast());
        System.out.println("First Customer: " + dq.peekFirst());


        System.out.println("Late:"+dq.removeFirst());
        while (!dq.isEmpty()) {
            String LateCustomer = dq.removeFirst();
            System.out.println("Late Customer " + LateCustomer);
        }
     

       
    }

}