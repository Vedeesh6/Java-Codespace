import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_reducearray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int[] arr= new int[n];
            long ans=0, sum=0;
            for(int i=0;i<n;i++) arr[i]= sc.nextInt();
            for(int i=n-1;i>=0;i--){
                sum+=arr[i];
                if(sum>0){
                    ans+=sum;
                    sum=0;
                }
            }
            System.out.println(Math.abs(ans));
        }sc.close();
    }
}
