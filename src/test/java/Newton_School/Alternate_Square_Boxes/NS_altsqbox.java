import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_altsqbox {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n * 2; ++i) {
            for (int j = 0; j < n * 2; ++j) {
                if (j / 2 % 2 != i / 2 % 2) {
                    System.out.print('.');
                } else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }
}
