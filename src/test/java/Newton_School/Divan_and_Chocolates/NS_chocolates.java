import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_chocolates {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long l=sc.nextLong(),r=sc.nextLong(),k=sc.nextLong();
        long[] a=new long[n];
        for(int i=0;i<n;i++) a[i]=sc.nextLong();
        Arrays.sort(a);int count=0;sc.close();
        for(int i=0;i<n;i++){
            if(a[i]>=l){
                if(a[i]<=r){
                    if(a[i]<=k){
                        k-=a[i];
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
