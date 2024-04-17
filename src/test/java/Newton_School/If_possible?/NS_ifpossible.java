import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_ifpossible {
    public static int minDivisor(int n) {
        for (int d = 2; d <= Math.round(Math.sqrt(n)); d++) {
            if (n % d == 0) {
                return d;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();

        for (int x = l; x <= r; x++) {
            int md = minDivisor(x);
            if (md != x) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
