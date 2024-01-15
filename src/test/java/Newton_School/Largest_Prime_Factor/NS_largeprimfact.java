import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.math.*;

class NS_largeprimfact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),max_prime=1,arg=(int)Math.sqrt(n);sc.close();
        if (isPrime(n)) max_prime = n;
        else {
            for(int i=2;i<=arg;i++){
            if(n%i==0){
                if(isPrime(i)) max_prime = i;
                if(isPrime(n/i)) max_prime = Math.max(max_prime, n/i);
            }
            }
        }
        System.out.println(max_prime);
    }

    public static boolean isPrime(int n){
        BigInteger b = new BigInteger(String.valueOf(n));
        return b.isProbablePrime(1);
    }
}
