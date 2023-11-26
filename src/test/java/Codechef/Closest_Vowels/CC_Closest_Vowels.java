/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Closest_Vowels
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int N=sc.nextInt();
		    String A=sc.next();
		    
		    long ans=1L;
		    
		    char ch[]=A.toCharArray();
		    for(int i=0;i<N;i++){
		        if(ch[i] == 'c' || ch[i] == 'g' || ch[i] == 'l' || ch[i] == 'r')
		        {
		            ans = (ans * 2) % 1000000007;
		        }
		    }
		    System.out.println(ans);
		}
	}
}
