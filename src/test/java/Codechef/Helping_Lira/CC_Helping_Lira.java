import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Helping_Lira
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float min = 1500000;
        float max = 0;
        int mini = 0;
        int maxi = 0;
        int i = 1;
        while (n-- > 0) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int x3 = scanner.nextInt();
            int y3 = scanner.nextInt();
            float area = Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2;
            if (area <= min) {
                min = area;
                mini = i;
            }
            if (area >= max) {
                max = area;
                maxi = i;
            }
            i++;
        }
        System.out.println(mini + " " + maxi);
        scanner.close();
	}
}
