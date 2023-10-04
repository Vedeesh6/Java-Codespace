import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_multof7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = 1;
        int rem = 7 % k;
        while (rem != 0 && n < 1000000) {
            rem = (rem * 10 + 7) % k;
            n++;
        }
        if (n == 1000000)
            System.out.println(-1);
        else
            System.out.println(n);
        sc.close();
    }
}
