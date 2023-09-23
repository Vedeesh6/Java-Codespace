import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_edwardtoys{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        Arrays.sort(arr);
        int sum=0;
        for(int i=n-1;i>=n-k;i--){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
