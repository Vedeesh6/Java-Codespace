/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Possible_GCD
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int m = Math.abs(a-b),c=0;
		    for(int i=1; i*i<=m; i++){
		        if(m%i==0){
		            c++;
		            if(i != (m/i)) c++;
		        }
		    }
		    System.out.println(c);
	    }
    }
}
