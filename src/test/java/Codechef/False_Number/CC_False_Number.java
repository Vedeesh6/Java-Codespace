import java.util.*;
import java.lang.*;
import java.io.*;

class CC_False_Number
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    String s=sc.next();
		    if(s.charAt(0)=='1')
		    {
		        s="10"+s.substring(1);
		    }
		    else
		    {
		        s='1'+s;
		    }
		    System.out.println(s);
		}
	}
}
