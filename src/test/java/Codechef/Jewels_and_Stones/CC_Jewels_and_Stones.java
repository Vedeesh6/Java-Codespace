/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Jewels_and_Stones
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    String s1=sc.next();
		    String s2=sc.next();
		    int count=0;
		    for(int i=0;i<s2.length();i++){
		        if(s1.contains(""+s2.charAt(i))){
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
