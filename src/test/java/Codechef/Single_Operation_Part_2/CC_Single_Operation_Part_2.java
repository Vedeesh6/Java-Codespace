import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Single_Operation_Part_2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		   String s=sc.next();
		    int count=1;
		   for(int i=1; i<n;i++)
		   {
		   if(s.charAt(i)=='0')
		   {
		       count++;
		   }
		   else{
		       break;
		   }
		   }
		   System.out.println(count);
		}
	}
}
