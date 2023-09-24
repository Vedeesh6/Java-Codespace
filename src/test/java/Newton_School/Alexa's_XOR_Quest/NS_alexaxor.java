import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_alexaxor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong(),b=sc.nextLong();
        System.out.println(findXOR(a-1)^findXOR(b));
    }

    static long findXOR(long n){
        long mod=n%4;
        return mod==0?n:mod==1?1:mod==2?n+1:0;
    }
}
