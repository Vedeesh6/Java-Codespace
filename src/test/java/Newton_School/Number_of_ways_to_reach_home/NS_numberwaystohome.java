import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_numberwaystohome{
    static final int mod = 1000000007;
    static long[][] dp = new long[100005][105];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 1; i <= 100; i++) {
            dp[0][i] = 1;
        }

        for (int k = 1; k <= 100; k++) {
            for (int i = 1; i <= 10000; i++) {
                for (int j = 1; j <= Math.min(i, k); j++) {
                    dp[i][k] = (dp[i][k] + dp[i - j][k]) % mod;
                }
            }
        }

        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println(dp[n][k] % mod);
        }
    }
}
