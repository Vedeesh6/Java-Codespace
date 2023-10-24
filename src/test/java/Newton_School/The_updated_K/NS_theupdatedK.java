import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_theupdatedK{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt(),n=sc.nextInt(),sum=0;
        for(int i=0;i<n;i++) sum+=sc.nextInt();
        sc.close();
        System.out.println(k+sum);
    }
}
