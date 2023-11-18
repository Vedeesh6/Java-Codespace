import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_maxsumpaireqlen {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(largestPairSumwithsamenumofdigits(arr, n));
    }
 
    private static long largestPairSumwithsamenumofdigits(int[] arr, int n)
    {
        Arrays.sort(arr);
        long max=0;
        for(int i=n-1;i>0;i--){
            int j=i-1;
                //System.out.println(arr[i]+" "+arr[j]);
                if(check(arr[i],arr[j])){
                    max=arr[i]+arr[j];break;
                }
        }
        return max;
    }

    private static boolean check(int i, int j) {
        String arg1=i+"";
        String arg2=j+"";

        return arg1.length()==arg2.length();
    }
}
