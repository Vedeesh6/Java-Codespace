import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class NS_coins {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long a=sc.nextLong(),b=sc.nextLong();sc.close();
        System.out.println((a==0)?1:a+b*2+1);
    }
}
