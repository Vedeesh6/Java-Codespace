/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Split_the_Str_Ing
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0)
        {
            int n = sc.nextInt();
            String str = sc.next();
            String a = str.substring(0,n-1);
            String b = str.substring(n-1);
            int flag =0;
            for(int i=0;i<n-1;i++)
            {
                if(a.charAt(i)==b.charAt(0)){
                    flag=1;
                    break;
                }
            }
            System.out.println(flag==1?"YES":"NO");
        }
	}
}
