package Collections;
import java.util.Stack;
public class ColStack {
    public static void main(String[] args) {
        Stack <String> s= new Stack<>();
s.push("Google.com");
s.push("YouTube.com");
s.push("Snapchat.com");
s.push("Facebook.com");
s.push("Instagram.com");
System.out.println("Current History"+s);

System.out.println("Most recent" + s.peek());
System.out.println(s.pop());
System.out.println(s);
System.out.println(s.peek());
    }
}
