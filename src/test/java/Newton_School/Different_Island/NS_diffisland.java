import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_diffisland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        if ((k * k) <= n && (n + k) % 2 == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
