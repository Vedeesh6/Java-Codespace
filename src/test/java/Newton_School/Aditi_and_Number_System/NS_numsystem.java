import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class NS_numsystem {
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong(),k=in.nextLong();in.close();
        long median=(long)Math.ceil((double)n/2);
        System.out.println(k<=median?2*k-1:2*(k-median));
    }
}
