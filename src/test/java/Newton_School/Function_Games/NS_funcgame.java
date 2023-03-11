import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_funcgame {
    public static long f(long t){
        long result=0;
        result=t*t+2*t+3;
        return result;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextInt();sc.close();
        System.out.println(function(t));
    }
    private static long function(long t) {
        long result=0;
        result=f(f(f(t)+t)+f(f(t)));
        return result;
    }
}
