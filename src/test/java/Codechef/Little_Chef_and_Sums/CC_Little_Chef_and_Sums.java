/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Little_Chef_and_Sums
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
	    int T=sc.nextInt();
	    while(T-->0)
	    {
	        int N=sc.nextInt();
	        int[] A=new int[N];
	        for(int i=0;i<N;i++)
	        {
	            A[i]=sc.nextInt();
	        }
	        
	        int res=0,c=0,sum=0;
	        int k=Integer.MAX_VALUE;
	        
	        for(int s=0;s<N;s++)
	        {
	            res=A[s]+sum;
	            
	            if(k>res)
	            {
	                k=res;
	                c=s;
	            }
	            
	        }
	        System.out.println(c+1);
	    }
	}
}
