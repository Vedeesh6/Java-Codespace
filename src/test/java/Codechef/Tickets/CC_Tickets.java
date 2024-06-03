/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Tickets
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0 ; i<n ; i++)
		{
		    String k = sc.next();
		    HashSet<Character>h1 = new HashSet<>();
		    for(int j = 0 ; j<k.length() ; j++)
		    {
		        char ch = k.charAt(j);
		        h1.add(ch);
		    }
		    if(h1.size()==2)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}
	}
}
