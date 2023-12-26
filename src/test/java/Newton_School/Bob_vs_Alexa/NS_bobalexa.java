import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_bobalexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), t = sc.next();
        System.out.println(substring(s,t));
    }

    public static String substring(String s, String t) {
        Stack<Character> stack = new Stack<>();
        int n=s.length(), m=t.length();
        for(int i=0;i<m;i++) stack.push(t.charAt(i));
        for(int i=0;i<n;i++) {
            if(stack.isEmpty()) break;
            if(s.charAt(i)==stack.peek()) stack.pop();
        }
        return stack.isEmpty()? "Yes" : "No";
    }
}
