import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_cricketinnings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n + 1];
        Map<Integer, Boolean> mp = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
            mp.put(a[i], true);
        }scanner.close();

        boolean f = false;
        for (int i = 1; i <= n; i++) {
            int t = a[i] - m;
            if (mp.containsKey(t)) {
                f = true;
                break;
            }
        }

        System.out.println(f ? "YES" : "NO");
        
    }
}
