import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_missfriend{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(),sum=(n*(n+1))/2,sum_n=0;
        for(int i=0;i<n-1;i++){
            sum_n+=sc.nextLong();
        }
        System.out.println((sum-sum_n)*2);
    }
}
