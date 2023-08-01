import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_xordiv{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();long sum=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i%2==0) sum^=i;
                if(i*i!=n){
                    if((n/i)%2==0) sum^=n/i;
                }
            }
        }
        System.out.println(sum);
    }
}
