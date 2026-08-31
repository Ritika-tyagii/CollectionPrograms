import java.util.LinkedList;
import java.util.Queue;

public class QueueTask {
    public static void main(String[] args) {
  Queue <String> q= new LinkedList<>();
q.offer("A");
q.offer("B");
q.offer("C");
q.offer("D");
q.offer("E");
System.out.println("Customers: " + q);
System.out.println("Next Customer: "+q.peek());
while(!q.isEmpty()){
    String servedCustomer =q.poll();
    System.out.println("Serving Customer "+servedCustomer);
}
//  String a=q.poll();
// System.out.println("Serving customer "+ a );
//  String b=q.poll();
// System.out.println("Serving customer "+ b );
//  String c=q.poll();
// System.out.println("Serving customer "+ c );
//  String d=q.poll();
// System.out.println("Serving customer "+ d );
//  String e=q.poll();
// System.out.println("Serving customer "+ e );

System.out.println(q.isEmpty());
if (q.isEmpty()){
System.out.println("All customer has been served");
}
    }
}
