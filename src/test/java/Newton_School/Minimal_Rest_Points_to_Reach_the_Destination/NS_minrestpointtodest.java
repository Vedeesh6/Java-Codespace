import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_minrestpointtodest {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();sc.close();
        double k = (-1.0 + Math.sqrt(1 + 8 * n)) / 2;
        System.out.println((Math.ceil(k) == Math.floor(k))?(long)k:(long)k+1);
    }
}
