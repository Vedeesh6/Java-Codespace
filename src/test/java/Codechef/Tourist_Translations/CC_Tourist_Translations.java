/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Tourist_Translations
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String s=sc.next();
		char[] ch1=s.toCharArray();
		for(int i=1;i<=a;i++)
		{
		    String s1=sc.next();
		    String s2="";
		    char[] ch=s1.toCharArray();
		    for(int j=0;j<ch.length;j++)
		    {
		        char c=ch[j];
		        if(c>='a' && c<='z')
		        {
		            int b=c-96;
		            s2+=ch1[b-1];
		        }
		        else if(c>='A' && c<='Z')
		        {
		            int b=c-64;
		            char q=ch1[b-1];
		            q=(char)(q-32);
		            s2+=q;
		        }
		        else if(c=='_')
		        {
		            s2+=" ";
		        }
		        else
		        {
		            s2+=c;
		        }
		    }
		    System.out.println(s2);
		}
	}
}
