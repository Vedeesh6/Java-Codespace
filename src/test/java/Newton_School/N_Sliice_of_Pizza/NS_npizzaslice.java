import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_npizzaslice {
    public static void main (String[] args) {
        int n=new Scanner(System.in).nextInt();
        System.out.println(n%2==0 || n==1?"Yes":"No");
    }
}
