/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Chef_and_Demonetisation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int s = sc.nextInt(), n = sc.nextInt(), count = 0;
		    if(s%2!=0){
		        count++;
		        s--;
		    }  
		    if(s%n==0){
		        System.out.println(s/n+count);
		    }
		    else{
		        System.out.println(s/n+count+1);
		    }
		}
	}
}
