import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_electionresult {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong(),a=sc.nextLong(),b=sc.nextLong();sc.close();
        System.out.println((Math.max(a,Math.max(b,n-a-b))));
    }
}
