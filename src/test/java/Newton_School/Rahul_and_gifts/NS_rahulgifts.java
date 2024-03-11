import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_rahulgifts {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int l = sc.nextInt();
    String s = sc.next();
    int x = 0, y = 0;
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == 'L') {
            x--;
        } else if (s.charAt(i) == 'R') {
            x++;
        } else if (s.charAt(i) == 'U') {
            y++;
        } else {
            y--;
        }
        if (x == k && y == l) {
            System.out.println("YES");
            return;
        }
    }
    System.out.println("NO");
    sc.close();
}
}
