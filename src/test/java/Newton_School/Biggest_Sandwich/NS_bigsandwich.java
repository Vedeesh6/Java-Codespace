import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_bigsandwich{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(n==1?0:Math.min(n-1,sc.nextLong())*2+1);
    }
}
