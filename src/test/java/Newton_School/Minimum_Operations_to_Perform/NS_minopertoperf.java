import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_minopertoperf {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int res = 0,n=sc.nextInt();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                res += i;
                n /= i;
            }
        }
        System.out.println(res);
    }
}
