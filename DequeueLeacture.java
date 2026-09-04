
import java.util.ArrayDeque;
import java.util.Deque;
public class DequeueLeacture{
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>() ;
        dq.addLast("A");
        dq.addLast("B");
        dq.addLast("C");
        dq.addLast("D");
        dq.addLast("E");
        System.out.println("Customers: " + dq);
        System.out.println("Next Customer: " + dq.peek());
        while (!dq.isEmpty()) {
            String servedCustomer = dq.poll();
            System.out.println("Serving Customer " + servedCustomer);
        }

        System.out.println(dq.isEmpty());
        if (dq.isEmpty()) {
            System.out.println("All customer has been served");
        }
    }
}