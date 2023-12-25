import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_findnumwithksetbits {
    public static int nextPowerOf2Exponent(int n) {
        // Check if n or n+1 is already a power of 2
        if ((n & (n - 1)) == 0 && n != 0) {
            // If n is a power of 2, return the exponent directly
            return Integer.numberOfTrailingZeros(n);
        }
        else if ((n & (n + 1)) == 0) {
            // If n+1 is a power of 2, return the exponent of n+1
            return Integer.numberOfTrailingZeros(n + 1);
        }

        // Find the highest set bit and shift left
        int count = 0;
        while (n > 1) {
            n >>= 1;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),k=sc.nextInt();
        System.out.println(nextPowerOf2Exponent(n)>=k?"Yes":"No");
        sc.close();
    }
}
