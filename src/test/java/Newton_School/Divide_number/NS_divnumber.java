import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_divnumber {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        long n = sc.nextLong(),mod=1000000007;
        long num = ((((n+2)%mod)*((n+1)%mod))%mod) / 2;
        System.out.println(num);
    }
}
