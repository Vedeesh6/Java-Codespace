/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int count=0, max=0;
		    String s = sc.next(), ans="";
		    for(int i=0; i<s.length(); i++){
		        if(s.charAt(i)=='(') count++;
		        else count--;
		        if(count>max){
		            max=count;
		        }
		    }
		    for(int i = 0; i<max; i++){
		        ans += "(";
		    }
		    for(int i = 0; i<max; i++){
		        ans += ")";
		    }
		    System.out.println(ans);
		}
	}
}
