import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_divnumbersum {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 0 || i % 3 == 0 || i % 7 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
