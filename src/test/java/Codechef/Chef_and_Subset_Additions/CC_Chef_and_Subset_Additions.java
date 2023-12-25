/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Chef_and_Subset_Additions
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                b[j] = sc.nextInt();
            }
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if (a[i] + x == b[i] || a[i] + y == b[i]) {
                    continue;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println("Yes");
            else System.out.println("No");
        }
	}
}
