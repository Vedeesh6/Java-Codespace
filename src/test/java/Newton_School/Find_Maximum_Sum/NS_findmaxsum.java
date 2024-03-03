import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_findmaxsum {
    final int MAX = 1000000; 
      
    // Function to find the maximum sum 
    static int breakSum(int n) 
    { 
        int dp[] = new int[n+1]; 
   
        // base conditions 
        dp[0] = 0;  dp[1] = 1; 
       
        // Fill in bottom-up manner using recursive 
        // formula. 
        for (int i=2; i<=n; i++) 
           dp[i] = Math.max(dp[i/2] + dp[i/3] + dp[i/4], i); 
       
        return dp[n];  
    } 
          
    // Driver program to test the above function 
    public static void main (String[] args) { 
        int n = new Scanner(System.in).nextInt(); 
        System.out.println(breakSum(n)); 
    } 
}
