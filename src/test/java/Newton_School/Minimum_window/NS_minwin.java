import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_minwin {
    static void minRange(int arr[], int n, int k){
        int start = 0,end = n;
        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<Integer>();
            int j;
            for (j = i; j < n; j++) {
                set.add(arr[j]);
                if (set.size() == k) {
                    if (j - i < end - start) {
                        start = i;
                        end = j;
                    }
                    break;
                }
            }
            if (j == n) break;
        }
        System.out.println(end-start+1);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            minRange(arr, n, k);
        }
    }
}
