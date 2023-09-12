import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_maxadjprod{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long maxadjprod=Long.MIN_VALUE,n=sc.nextLong(),start=sc.nextLong();
        for(int i=1;i<n;i++){
            long end=sc.nextLong();
            maxadjprod=Math.max(maxadjprod,start*end);
            start=end;
        }sc.close();
        System.out.println(maxadjprod);   
    }
}
