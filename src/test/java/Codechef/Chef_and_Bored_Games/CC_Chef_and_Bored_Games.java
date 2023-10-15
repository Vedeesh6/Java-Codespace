/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Chef_and_Bored_Games
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt(), ans=0;
		    for(int i=1; i<=n; i++){
		        if((i & 1) == 1){
		            ans += (n-i+1)*(n-i+1);
		        }
		    }
		    System.out.println(ans);
		}
	}
}
