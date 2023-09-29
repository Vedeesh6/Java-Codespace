/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Transfusion_Chain
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt(), a=0, b=0, ab=0, o=0;
		    for(int i=0; i<n; i++){
		        String s = sc.next();
		        if(s.equals("A")){
		            a++;
		        }
		        else if(s.equals("B")){
		            b++;
		        }
		        else if(s.equals("AB")){
		            ab++;
		        }
		        else{
		            o++;
		        }
		    }
		    System.out.println(ab+o+Math.max(a,b));
		}
	}
}
