import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_dogmeetingpoint{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long p=sc.nextLong(),q=sc.nextLong(),r=sc.nextLong(),s=sc.nextLong();sc.close();
        System.out.println(((q-p)%(r+s)==0)?(q-p)/(r+s):-1);
    }
}
