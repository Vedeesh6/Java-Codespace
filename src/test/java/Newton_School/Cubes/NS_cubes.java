import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_cubes{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long x=1,y=1;
        boolean flag=false;
        for(long i=1;i*i*i<=n/2;i++){
            long temp=n-(i*i*i);
            long temp2=(long)Math.cbrt(temp);
            if(temp2*temp2*temp2==temp){
                x=i;
                y=temp2;
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println(x*y);
        }
        else{
            System.out.println(-1);
        }
    }
}
