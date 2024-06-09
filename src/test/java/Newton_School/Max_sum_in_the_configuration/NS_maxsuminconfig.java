import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_maxsuminconfig {
    static int maxSum(int arr[], int n)
    {
        int cum_sum = 0,curr_val = 0;
        for (int i = 0; i < n; i++){
            cum_sum += arr[i];
            curr_val += i * arr[i];
        }

        int res = curr_val;
 
        for (int i = 1; i < n; i++){
            int next_val = curr_val - (cum_sum - arr[i-1]) + arr[i-1] * (n-1);
            curr_val = next_val;
            res = Math.max(res, next_val);
        }
 
        return res;
    }
 
    // Driver code
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println(maxSum(arr, n));
    }
}
