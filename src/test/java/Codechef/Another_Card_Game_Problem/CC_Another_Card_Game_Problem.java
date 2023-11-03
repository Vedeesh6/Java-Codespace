/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Another_Card_Game_Problem
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int a = sc.nextInt(), b = sc.nextInt(), a1=a/9, b1=b/9;
		    if(a1==b1){
		        System.out.println(1+" "+(a%9==0?a1:a1+1));
		    }
		    else if(a1>b1){
		        System.out.println(1+" "+(b%9==0?b1:b1+1));
		    }
		    else if(b1>a1){
		        System.out.println(0+" "+(a%9==0?a1:a1+1));
		    }
		}
	}
}
