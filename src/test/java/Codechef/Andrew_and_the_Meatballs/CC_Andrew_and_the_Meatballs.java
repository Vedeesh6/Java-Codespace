import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Andrew_and_the_Meatballs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=1;i<=t;i++)
		{
		    int n=in.nextInt();
		    long m=in.nextLong();
		    long[] p=new long[n];
		    for(int j=0;j<n;j++)
		    {
		        p[j]=in.nextLong();
		    }
		    Arrays.sort(p);
		    long s=0;
		    int c=0;
		    int flag=0;
		    for(int j=n-1;j>=0;j--)
		    {
		        s+=p[j];
		        c++;
		        if(s>=m)
		        {
		            flag=1;
		          //  System.out.println(c);
		            break;
		        }
		     }
		        if(flag==1) 
		        System.out.println(c);
		        else
		        System.out.println(-1);
	}
}
}
