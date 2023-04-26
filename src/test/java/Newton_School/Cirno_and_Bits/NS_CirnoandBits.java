import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_CirnoandBits{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();sc.close();
        if(x%2!=0) System.out.println((x==1)?3:1);
        else{
            long y = 1;
            while(x%2==0){
                x/=2;
                y*=2;
            }
            System.out.println(y+(x==1?1:0));
        }
    }
}
