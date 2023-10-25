/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_To_Divide_or_Not_To_Divide
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    long a=sc.nextInt(), b=sc.nextInt(), n=sc.nextInt();
		    if(a==b || a%b==0){
		        System.out.println(-1);
		    }
		    else{
		        long ans = n-n%a;
		        if(n%a != 0){
		            ans += a;
		        }
		        if(ans%b == 0){
		            ans += a;
		        }
		        System.out.println(ans);
		    }
		}
	}
}
