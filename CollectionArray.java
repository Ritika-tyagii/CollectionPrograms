import java.util.ArrayList;
public class CollectionArray{
    public static void main(String[] args) {
        ArrayList <String> std = new ArrayList<> ();
std.add("Amit");
std.add("Aditya");
std.add("Aparna");
std.add("Naman");
std.add("Aparna");
std.add("Ritika");
System.out.println(std);
System.out.println(std.get(0));
System.out.println(std.get(5));
 std.add(2,"Riya");

std.set(4, "Anjali");

std.remove(3);
System.out.println(std);
System.out.println(std.contains("Rahul"));
System.out.println( std.indexOf("Amit"));
System.out.println("Final : " + std);
System.out.println("size:- "+ std.size());
    }
}
