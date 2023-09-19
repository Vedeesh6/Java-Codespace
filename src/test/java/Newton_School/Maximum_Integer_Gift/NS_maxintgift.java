import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_maxintgift {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt(), y=sc.nextInt();
        int marg=x*y,aarg=x+y,sarg=x-y;
        System.out.println(marg>aarg?marg>sarg?marg:sarg:aarg>sarg?aarg:sarg);
    }
}
