import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_profitablestock {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int largest=arr[n-1],currentmax=0;
        for(int i=n-2;i>=0;i--){
            largest=Math.max(largest,arr[i]);
            currentmax=Math.max(currentmax,largest-arr[i]);
        }
        System.out.println(currentmax);
    }
}
