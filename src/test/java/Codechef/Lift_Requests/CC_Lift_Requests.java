/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Lift_Requests
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt(), q = sc.nextInt(), last=0;
		    long ans=0;
		    for(int i=0; i<q; i++){
		        int start = sc.nextInt();
		        int end = sc.nextInt();
		        ans += Math.abs(last-start) + Math.abs(end-start);
		        last = end;
		    }
		    System.out.println(ans);
		}
	}
}
