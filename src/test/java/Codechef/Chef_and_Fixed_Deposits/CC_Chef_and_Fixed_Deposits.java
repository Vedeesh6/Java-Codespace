import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Chef_and_Fixed_Deposits
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int c=0,sum=0;
		    int a=0;
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    int []arr=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		       
		    }
		    Arrays.sort(arr);
		    for(int i=n-1;i>=0;i--)
		    {
		        sum+=arr[i];
		        c++;
		        if(sum>=x)
		        {
		            a=1;
		            System.out.println(c);
		            break;
		        }
		    }
		    if(a==0)
		    System.out.println(-1);
		    
		}
	}
}
