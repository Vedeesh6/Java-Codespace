/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Chef_and_Coupon
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		    int d=sc.nextInt(), c=sc.nextInt(), 
		    a=sc.nextInt()+sc.nextInt()+sc.nextInt(),
		    b=sc.nextInt()+sc.nextInt()+sc.nextInt(),
		    sum1 = a+d+b+d,
		    sum2 = (a>=150?a:a+d)+(b>=150?b:b+d)+c;
		    System.out.println(sum2<sum1?"YES":"NO");
		}
	}
}
