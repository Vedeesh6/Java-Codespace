import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_passparcel {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),time=sc.nextInt();
        System.out.println((time%n)+1);
    }
}
