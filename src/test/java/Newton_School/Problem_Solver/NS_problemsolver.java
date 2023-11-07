import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_problemsolver{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),max=0;
        for(int i=0;i<n;i++) max=Math.max(max,sc.nextInt());
        System.out.println(max);
    }
}
