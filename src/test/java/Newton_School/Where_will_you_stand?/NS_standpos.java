import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_standpos {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
        System.out.println((x+y==n||x+y>n)?(n-x):y+1);
    }
}
