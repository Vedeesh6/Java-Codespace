import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_flip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();String s = sc.next();
        int a = s.indexOf('A'),b = s.lastIndexOf('B');
        System.out.println(Math.max(0, b - a));
    }
}
