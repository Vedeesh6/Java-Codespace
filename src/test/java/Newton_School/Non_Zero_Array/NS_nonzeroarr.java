import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_nonzeroarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),count_0=0,sum=0;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x==0) count_0++;
            sum+=x;
        }sc.close();
        System.out.println(count_0+(sum+count_0==0?1:0));
    }
}
