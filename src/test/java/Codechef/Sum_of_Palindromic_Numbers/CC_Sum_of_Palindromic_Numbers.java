/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Sum_of_Palindromic_Numbers
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int l=sc.nextInt(), r=sc.nextInt(), sum=0;
		    for(int i=l; i<=r; i++){
		        StringBuffer sb = new StringBuffer(String.valueOf(i));
		        sb.reverse();
		        if((String.valueOf(i)).equals(sb.toString())) sum += i;
		    }
		    System.out.println(sum);
		}
	}
}
