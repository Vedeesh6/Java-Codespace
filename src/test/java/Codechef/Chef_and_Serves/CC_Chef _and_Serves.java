/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Chef_and_Serves
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int p1 = sc.nextInt(), p2 = sc.nextInt(), k = sc.nextInt();
		    System.out.println(((p1+p2)%(2*k))<k?"CHEF":"COOK");
		}
	}
}
