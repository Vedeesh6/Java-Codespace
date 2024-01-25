/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Chef_and_The_Right_Triangles
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int ans = 0;
		
		while(t-- > 0) {
		    int x1 = sc.nextInt();
		    int y1 = sc.nextInt();
		    int x2 = sc.nextInt();
		    int y2 = sc.nextInt();
		    int x3 = sc.nextInt();
		    int y3 = sc.nextInt();
		    
		    int p = (int)Math.pow((x2 - x1), 2) + (int)Math.pow((y2 - y1), 2);
		    int b = (int)Math.pow((x3 - x1), 2) + (int)Math.pow((y3 - y1), 2);
		    int h = (int)Math.pow((x3 - x2), 2) + (int)Math.pow((y3 - y2), 2);
		    
		    if(p == (b + h) || b == (p + h) || h == (p + b)) ans++;
 		}
		
		System.out.println(ans);
	}
}
