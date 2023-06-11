import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_evalstring {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();sc.close();
        System.out.println((s.charAt(0)-'0')*(s.charAt(2)-'0'));
    }
}
