import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_infected {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),y=sc.nextInt();
        System.out.println((n==y)?y*2-1:n+y);
    }
}
