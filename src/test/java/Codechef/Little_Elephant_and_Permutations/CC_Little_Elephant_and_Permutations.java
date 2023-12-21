/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Little_Elephant_and_Permutations
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    long a[]=new long[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextLong();
		    }
		    // First count the local number of inversions
		    int count=0;
		    for(int i=0;i<n-1;i++)
		    {
		        if(a[i]>a[i+1])
		        count++;
		    }
		    // now find total number of inversions
		    int inv=0;
		    for(int i=0;i<n-1;i++)
		    {
		        for(int j=i+1;j<n;j++)
		        {
		            if(a[i]>a[j])
		            inv++;
		        }
		    }
		    if(count==inv)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
		    
	}
}
