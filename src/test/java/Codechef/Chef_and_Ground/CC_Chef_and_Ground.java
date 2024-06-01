import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Chef_and_Ground
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    do
	    {
	        int n,m;
	        n=sc.nextInt();
	        m=sc.nextInt();
	        int a=0;
	        int[] v=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            v[i]=sc.nextInt();
	            if(a<v[i]) a=v[i];
	        }
	        for(int i:v) m-=(a-i);
	        if(m%n==0) System.out.println("Yes");
	        else System.out.println("No");
	    }while(--t>0);
	}
}
