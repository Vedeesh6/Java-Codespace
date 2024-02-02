import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class NS_rajgame {
    static final int mx = 400000;
    static int[] ara = new int[mx];
    static int[] val = new int[mx];
    static char[] str = new char[mx];
    static int ran;

    static int func(int pos, int pos2) {
        if (pos < 0 && pos2 >= ran) return 1;
        if (pos < 0) return 0;
        if (pos2 >= ran) return 0;
        if (ara[pos] != ara[pos2]) return 0;
        if (val[pos] + val[pos2] <= 2) return 0;
        return func(pos - 1, pos2 + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String input = scanner.next();
        str = input.toCharArray();
        n = str.length;

        for (int i = 0; i < n; ) {
            int cnt = 0, j;
            for (j = i; j < n && str[i] == str[j]; j++) {
                cnt++;
            }
            ara[ran] = str[i] - 64;
            val[ran++] = cnt;
            i = j;
        }

        if (ran % 2 == 0) {
            System.out.println("0");
            return;
        }

        int g = ran / 2;

        if (val[g] >= 2) {
            int ans = func(g - 1, g + 1) * (val[g] + 1);
            System.out.println(ans);
        } else {
            System.out.println("0");
        }
    }
}
