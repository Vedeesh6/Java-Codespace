import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_uniquelcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(factors(sc.nextLong()));sc.close();
    }

    private static int factors(long n) {
        int count = 0;
        for (long i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                count++;
        }
        return count*2-(Math.sqrt(n)==(int)Math.sqrt(n)?1:0);
    }
}
