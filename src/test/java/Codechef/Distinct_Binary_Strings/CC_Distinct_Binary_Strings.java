/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Distinct_Binary_Strings
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0)
		{
		    int n=sc.nextInt();
		    String s=sc.next();
		    int count=1;
		    //char prev=s.charAt(0);
		    for(int i=0;i<n-1;i++)
		    {
		        if(s.charAt(i)!=s.charAt(i+1))
		         count++;
		    }
		    System.out.println(count);
		}
	}
}
