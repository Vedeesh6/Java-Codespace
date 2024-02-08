import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_reachend {
    static int countWays(int n)
    {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
 
        for (int i = 2; i <= n; i++)
            dp[i] = (dp[i - 1] + dp[i - 2])%1000000007;
        return dp[n];
    }
 
    // Driver method
    public static void main(String[] args)
    {
        int n = new Scanner(System.in).nextInt();
        System.out.println(countWays(n));
    }
}
