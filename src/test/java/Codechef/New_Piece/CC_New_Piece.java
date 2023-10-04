/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_New_Piece
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int a=sc.nextInt(), b=sc.nextInt(), p=sc.nextInt(), q=sc.nextInt();
		    if(a==p && b==q){
		        System.out.println(0);
		    }
		    else{
		        if((a+b+p+q)%2==0){
		            System.out.println(2);
		        }
		        else{
		            System.out.println(1);
		        }
		    }
		}
	}
}
