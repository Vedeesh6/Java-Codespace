import java.util.*;
import java.math.*;

public class NS_convertprime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),sum=0;
        for(int i=0;i<n;i++) sum+=sc.nextInt();
        sc.close();
        for(int i=sum;i>=0;i++) if(isPrime(i)) {System.out.println(i-sum);break;}
    }

    public static boolean isPrime(int n) {
        BigInteger b = new BigInteger(String.valueOf(n));
        return b.isProbablePrime(1);
    }
}
