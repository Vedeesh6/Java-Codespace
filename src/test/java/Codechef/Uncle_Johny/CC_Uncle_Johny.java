/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Uncle_Johny
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0; i<n; i++)
		       a[i] = sc.nextInt();
		    int k = sc.nextInt();
		    int x = a[k-1];
		    Arrays.sort(a);
		    for(int i=0; i<n; i++)
		    {
		        if(x==a[i])
		          System.out.println(i+1);
		    }
		    
		}
	}
}
