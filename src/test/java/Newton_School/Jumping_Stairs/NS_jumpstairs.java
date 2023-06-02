import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class NS_jumpstairs {
    public static long climbStairs(int n, int k) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long[] steps = new long[n + 1];
            steps[0] = 1;
            steps[1] = 1;
            for (int i = 2; i <= n; i++) {
                for (int j = 1; j <= k && j <= i; j++) {
                    steps[i] += steps[i - j]%1000000007;
                }
            }
            return steps[n-1]%1000000007;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();sc.close();
        System.out.println(climbStairs(n, k));
    }
}
