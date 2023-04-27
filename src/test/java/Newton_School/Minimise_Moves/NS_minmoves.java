import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class NS_minmoves {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong(),d=sc.nextLong();sc.close();
        if(d<b || (a-b)<(c-d)) System.out.println(-1);
        else System.out.println(2*(d-b)+a-c);
    }
}
