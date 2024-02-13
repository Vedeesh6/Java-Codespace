import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_rajandparty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m=sc.nextInt(),z=sc.nextInt();
        System.out.println(z/lcm(n,m));
    }

    public static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }

    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
