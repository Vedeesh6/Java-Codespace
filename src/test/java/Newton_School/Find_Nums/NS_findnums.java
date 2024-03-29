import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.math.*;

public class NS_findnums {
    /*Reverse GoldBach Conjecture*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt(),r=sc.nextInt();sc.close();
        for(int i=l;i<=r;i++){
            if(isPrime(i) || i==0 || i==1 || i==3){
                continue;
            }
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

    public static boolean isPrime(int n){
        BigInteger b = new BigInteger(String.valueOf(n));
        return b.isProbablePrime(1);
    }
}
