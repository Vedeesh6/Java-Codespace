import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_noofcommonfact {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(comm(sc.nextInt(),sc.nextInt()));
    }
    public static int comm(int a, int b) {
        int ans = 0, n = Math.min(a, b);
        for (int i = 1; i <= n; ++i) {
            if (a % i == 0 && b % i == 0) {
                ++ans;
            }
        }
        return ans;
    }
}
