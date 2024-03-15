import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Greedy_Puppy
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int m=0;
		  for(int i=1;i<=b;i++)
		  {
		      int re=a%i;
		      if(re>m)
		      {
		          m=re;
		      }
		  }
		  System.out.println(m);
		}
	}
}
