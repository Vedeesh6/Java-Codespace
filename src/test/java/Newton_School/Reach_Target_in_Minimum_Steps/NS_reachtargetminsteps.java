import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_reachtargetminsteps {
    static int minOperation(int k){
        int dp[] = new int[k + 1];
 
        for(int i = 1; i <= k; i++){
            dp[i] = dp[i - 1] + 1;
            if (i % 2 == 0){
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
        }
        return dp[k];
    }
    public static void main (String []args){
        System.out.print( minOperation(new Scanner(System.in).nextInt()));
    }
}
