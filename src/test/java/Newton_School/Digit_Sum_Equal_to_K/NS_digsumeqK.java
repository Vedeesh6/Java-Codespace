import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_digsumeqK{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt(),count=0;
        for(int i=1;i<=n;i++){
            if(sumofdigits(i)==k) count++;
        }
        System.out.println(count);
    }

    public static int sumofdigits(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
