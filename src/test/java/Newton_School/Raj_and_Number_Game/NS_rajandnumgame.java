import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_rajandnumgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long res = 0;
        long[] cnt = new long[k];
        
        for (int i = 1; i <= n; i++) {
            cnt[i % k]++;
        }
        
        for (int i = 1; i <= n; i++) {
            int j = ((k - i) % k + k) % k;
            if ((j + j) % k == 0) {
                res += cnt[j] * cnt[j];
            }
        }

        System.out.println(res);
        System.err.println("Hello, World!");
    }
}
