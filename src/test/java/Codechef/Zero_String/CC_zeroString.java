/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_zeroString
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0){
		    int n = sc.nextInt(), c0=0, c1=0;
		    String s = sc.next();
		    for(int i=0; i<n; i++){
		        if(s.charAt(i)=='1'){
		            c1++;
		        }
		        else{
		            c0++;
		        }
		    }
		    System.out.println(c1>c0?(1+c0):c1);
		} 
	}
}
