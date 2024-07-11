import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_checklcm {
    static long lcm(long n) {

        // code here

        if(n<=2) return n;

        if((n&1)==1) return (n-2)*(n-1)*(n);

        if((n%3)==0) return (n-2)*(n-1)*(n-3);

        return (n-3)*(n-1)*(n);

    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(lcm(n));
    }
}
