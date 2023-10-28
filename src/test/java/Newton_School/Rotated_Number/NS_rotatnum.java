import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_rotatnum.java{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++) sc.nextInt();
        int k=sc.nextInt();sc.close();
        System.out.println(k%n+1);
    }
}
