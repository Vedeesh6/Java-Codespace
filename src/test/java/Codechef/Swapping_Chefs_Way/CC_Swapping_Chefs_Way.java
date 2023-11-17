/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Swapping_Chefs_Way
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    boolean b = true;
		    String s = sc.next();
		    char[] ch = s.toCharArray();
		    
		    for(int i=0; i<n/2; i++){
		        if(ch[i]>ch[n-1-i]){
		            char c = ch[i];
		            ch[i] = ch[n-1-i];
		            ch[n-1-i] = c;
		        }
		    }
		    for(int i=0; i<n-1; i++){
		        if(ch[i]>ch[i+1]){
		            b = false;
		            break;
		        }
		    }
		    System.out.println(b?"YES":"NO");
		}
	}
}
