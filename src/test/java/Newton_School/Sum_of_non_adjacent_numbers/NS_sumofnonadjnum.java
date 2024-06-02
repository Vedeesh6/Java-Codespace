import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_sumofnonadjnum {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();long[] dp=new long[n];
        dp[0]=sc.nextInt();
        if(n==1){System.out.print(dp[0]);return;}
        dp[1]=sc.nextInt();
        if(n==2){System.out.print(Math.max(dp[0],dp[1]));return;}
        dp[2]=dp[0]+sc.nextInt();
        for(int i=3;i<n;i++){
            int x=sc.nextInt();
            dp[i]=Math.max(dp[i-2],dp[i-3])+x;
        }
        sc.close();
        System.out.print(Math.max(dp[n-1], dp[n-2]));
    }
}
