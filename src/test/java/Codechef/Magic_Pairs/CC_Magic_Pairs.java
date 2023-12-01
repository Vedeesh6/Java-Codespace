/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Magic_Pairs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t!=0)
		{
		    int n=scan.nextInt();
		    int a[]=new int[n];
		  //  Arrays.sort(a);
		      long ans=0;
		    for(int i=0;i<n;i++)
		    {
		        a[i]=scan.nextInt();
		        ans+=i;
		    }
		    
		    System.out.println(ans);
		    
		    t--;
		}
	}
}
