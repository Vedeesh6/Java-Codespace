import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Maximum_OR_Minimum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int c0 = 0;
            int c1 = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 0) {
                    c0++;
                } else {
                    c1++;
                }
            }
            if (c0 > c1) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
	}
}
