import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class NS_dissatisfaction {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(),x=sc.nextLong(),t=sc.nextLong();sc.close();
        t=(n*x>t)?t:(n*x);long z=t/x;
        System.out.println(z*(n-z)+z*(z-1)/2);
    }
}
