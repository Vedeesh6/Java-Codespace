import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_maxvaltriplet{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();long max_res=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            long res=0;
            for(int j=i+1;j<n;j++){
                res=0;
                for(int k=j+1;k<n;k++){
                    res=(arr[i]-arr[j])*arr[k];
                    max_res=Math.max(max_res, res);
                }
            }
        }
        System.out.println(max_res);
    }
}
