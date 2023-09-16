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
		    int n = sc.nextInt(), count=0;
		    String s = sc.next();
		    for(int i=0; i<s.length()-1; i++){
		        if(s.charAt(i)=='0' && s.charAt(i+1)=='1'){
		            count++;
		        }
		    }
		    if(s.charAt(0)=='1') count++;
		    if(s.charAt(s.length()-1)=='0') count++;
		    System.out.println(count);
		}
	}
}
