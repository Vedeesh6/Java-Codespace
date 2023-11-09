import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_balancearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.gc();
        int n=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt(),sum=0;
        for(int i=0;i<n;i++) sum+=sc.nextInt();
        sc.close();
        System.out.println(Math.min((n+sum)/2*a,(n-sum)/2*b));
    }
}
