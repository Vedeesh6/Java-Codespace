/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_A_Good_Set
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt(), num=1;
		    for(int i=0; i<n; i++){
		        System.out.print(num+" ");
		        num += 2;
		    }
		    System.out.println();
        }
	}
}
