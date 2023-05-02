import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_binarydecimal {
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();in.close();
        long ans=0;
        while(n!=0){
            ans=Math.max(ans,n%10);
            n/=10;
        }
        System.out.println(ans);
    }
}
