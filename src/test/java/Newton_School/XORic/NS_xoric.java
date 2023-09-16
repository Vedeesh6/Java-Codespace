import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_xoric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),k=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int queries = sc.nextInt();
        while(queries-->0){
            int l=sc.nextInt()-1,r=sc.nextInt()-1;
            for(int i=l;i<=r;i++) arr[i]^=k;
        }sc.close();
        int sum=0;
        for(int i=0;i<n;i++) sum+=arr[i];
        System.out.println(sum);
    }
}
