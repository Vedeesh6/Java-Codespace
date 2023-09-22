import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_divtransform {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(),k=sc.nextLong(),rem_sum=0;
        for(int i=0;i<n;i++){
            long rem=sc.nextLong()%k;
            if(rem>(k/2)) rem=k-rem;
            rem_sum+=rem;
        }sc.close();
        System.out.println(rem_sum);
    }
}
