import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_smallcommonmult{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(lcm(sc.nextInt(),sc.nextInt(),sc.nextInt()));
    }

    public static int lcm(int a, int b) {
        return a*b/gcd(a,b);
    }

    public static int lcm(int a, int b, int c) {
        return lcm(lcm(a,b),c);
    }

    public static int gcd(int a, int b) {
        if (a<b) {
            int temp=a;
            a=b;
            b=temp;
        }
        if (b==0) return a;
        return gcd(b,a%b);
    }
}
