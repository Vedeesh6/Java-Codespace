import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_findiv {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0, b = 1, c = 0,k=0;
		for (int i = 1; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
			if (c % n == 0) {
				k=i;
				break;
			}
		}
		System.out.println(k==0?-1:k+1);
	}
}
