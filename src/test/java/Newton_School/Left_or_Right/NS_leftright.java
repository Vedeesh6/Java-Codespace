import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_leftright {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();sc.close();
		System.out.println(n==1?2:n%3==0?n/3:n/3+1);
    }
}
