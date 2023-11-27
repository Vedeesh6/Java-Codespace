/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Just_Like_Mob
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt(), m=sc.nextInt(), k=sc.nextInt(), x=sc.nextInt();
		    int temp = x%(m+k*n);
		    System.out.println(temp>n*(k-1) || temp==0 ? "YES":"NO");
		}
	}
}
