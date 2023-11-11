/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Equal_Coins
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int x=sc.nextInt(), y=sc.nextInt();
		    if((x+2*y)%2!=0 || (y%2!=0 && x<2)){
		      System.out.println("NO");
	        }
	        else{
		      System.out.println("YES");
		    }
		}
	}
}
