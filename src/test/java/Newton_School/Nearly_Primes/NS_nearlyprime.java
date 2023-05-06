import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_nearlyprime{
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),count=0;in.close();
        boolean[] arr=new boolean[n+1];
        int[] arr2=new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=false;
            arr2[i]=0;
        }
        for(int i=2;i<=n;i++){
            if(arr[i]==false){
                for(int j=i+i;j<=n;j+=i){
                    arr[j]=true;arr2[j]++;
                }
            }
            if(arr2[i]==2)count++;
        }
        System.out.println(count);
    }
}
