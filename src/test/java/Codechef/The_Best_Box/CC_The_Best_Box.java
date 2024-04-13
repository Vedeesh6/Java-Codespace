import java.util.*;
import java.lang.*;
import java.io.*;

class CC_The_Best_Box
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 1; i <= t; i++) {
            solve(i, scanner);
        }
        scanner.close();

	}
	
	public static void solve(int test, Scanner scanner) {
        double p = scanner.nextDouble();
        double s = scanner.nextDouble();
        double l = (p - Math.sqrt(p * p - 24 * s)) / 12;
        System.out.printf("%.2f%n", l * l * l - (p / 4) * l * l + s * l / 2);
    }
}
