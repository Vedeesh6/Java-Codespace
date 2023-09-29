import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class NS_parentdist {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = 1;

        while (t-- > 0) {
            solve(sc, pw);
        }

        sc.close();
        pw.close();
    }

    private static void solve(Scanner sc, PrintWriter pw) {
        int n = sc.nextInt();
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(1, 1);

        for (int i = 1; i < n; i++) {
            int x = sc.nextInt();
            mp.put(i + 1, x);
        }

        int x = n;
        int ans = 1;
        while (mp.get(x) != 1) {
            ans++;
            x = mp.get(x);
        }

        pw.println(ans);
    }
}
