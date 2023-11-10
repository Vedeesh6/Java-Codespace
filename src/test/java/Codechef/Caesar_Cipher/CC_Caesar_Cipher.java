/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Caesar_Cipher
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int n = sc.nextInt();
		    String s=sc.next(), t=sc.next(), u=sc.next(), ans="";
		    int diff = t.charAt(0)-s.charAt(0);
		    if(diff<0) diff += 26;
		    for(int i=0; i<u.length(); i++){
		        int x = u.charAt(i)-'a';
		        x = (x+diff)%26;
		        ans += (char)('a'+x);
		    }
		    System.out.println(ans);
		}
	}
}
