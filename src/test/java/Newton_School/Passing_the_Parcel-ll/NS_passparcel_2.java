import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_passparcel_2{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong()-1,t=sc.nextLong()%(n*2);
        System.out.println((n>=t)?t+1:(n*2-t)+1);
    }
}
