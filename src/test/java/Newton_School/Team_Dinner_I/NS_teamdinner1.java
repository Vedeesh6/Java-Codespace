import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.text.*;
import java.math.*;

public class NS_teamdinner1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0;
        for(int i=0;i<n;i++) sum+=sc.nextInt();
        sc.close();
        if(isPrime(sum/3)) System.out.println(0);
        else System.out.println(new DecimalFormat("#.##").format(sum/7.0));
    }

    public static boolean isPrime(int n){
        BigInteger b=new BigInteger(String.valueOf(n));
        return b.isProbablePrime(1);
    }
}
