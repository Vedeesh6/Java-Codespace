import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_ binproduct{
    static final int MAX = 100007;
    static final int MOD = 1000000007;
    static List<Integer> binaryDecimals = new ArrayList<>();

    static boolean ok(int n) {
        if (n == 1) {
            return true;
        }
        boolean ans = false;
        for (int i : binaryDecimals) {
            if (n % i == 0) {
                ans |= ok(n / i);
            }
        }
        return ans;
    }

    static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(ok(n) ? "Yes" : "No");
    }

    public static void main(String[] args) {
        for (int i = 2; i < MAX; i++) {
            int curr = i;
            boolean bad = false;
            while (curr > 0) {
                if (curr % 10 > 1) {
                    bad = true;
                    break;
                }
                curr /= 10;
            }
            if (!bad) {
                binaryDecimals.add(i);
            }
        }
        solve();
    }
}
