import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_sqandcube {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println((int) (a+Math.pow(a,2)+Math.pow(a,3)));
    }
}
