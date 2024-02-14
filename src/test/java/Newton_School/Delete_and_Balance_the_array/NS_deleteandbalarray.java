import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_deleteandbalarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] v = new long[n];

        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextLong();
        }
        int k = scanner.nextInt();
        Arrays.sort(v);
        int count = 1;
        int mx = 1;
        for (int i = 1; i < n; i++) {
            if ((v[i] - v[i - 1]) <= k) {
                count++;
                mx = Math.max(count, mx);
            } else
                count = 1;
        }
        int ans = n - mx;
        System.out.println(ans);
    }
}
