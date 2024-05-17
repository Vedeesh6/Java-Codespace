import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_jump123 {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] dp=new long[n+1];
        dp[1]=1;dp[2]=2;dp[3]=4;
        if(n<4){
            System.out.println(dp[n]);return;
        }
        for(int i=4;i<=n;i++){
            dp[i]=((dp[i-1]%1000000007)+(dp[i-2]%1000000007)+(dp[i-3]%1000000007))%1000000007;
        }
        System.out.println(dp[n]%1000000007);
    }
}
