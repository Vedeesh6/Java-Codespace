import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_pleasenum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0;
        while(n>=10){
            sum=0;
            while(n>0){
                sum+=n%10;
                n/=10;
            }
            n=sum;
        }
        System.out.println(sum%2==0?"Yes":"No");
    }
}
