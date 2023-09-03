/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Chef_and_Strings
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		byte t = scan.nextByte();
		while(t-->0)
		{
		    int n = scan.nextInt(),a=0,b=0;
		    long ans=0;
		    a = scan.nextInt();
		    for(int i=1; i<n; i++)
		    {
		        b = scan.nextInt();
		        ans = ans + Math.abs(a-b) - 1;
		        a = b;
		    }
		    System.out.println(ans);
		}
	}
}
