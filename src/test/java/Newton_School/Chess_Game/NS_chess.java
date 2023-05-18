import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class NS_chess {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt();sc.close();
        long arg1=2*a+b, arg2=2*c+d;
        System.out.println(arg1>arg2 ? "Alexa" : arg1<arg2 ? "Bob" : "Tie");
    }
}
