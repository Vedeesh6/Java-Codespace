import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_digitsum {
    public static int digitsum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(Math.max(digitsum(sc.nextInt()),digitsum(sc.nextInt())));
        sc.close();
    }
}
