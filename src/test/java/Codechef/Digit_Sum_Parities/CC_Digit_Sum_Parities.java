/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Digit_Sum_Parities
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		  int n = sc.nextInt();
		  int m = n;
		  int nine = 0;
		  while(n%10==9){
		      nine++;
		      n/=10;
		  }
		  if(nine%2==1)
		  System.out.println(m+2);
		  else
		  System.out.println(m+1);
		}
	}
}

/*
Here just try to calculate number of nine in the given digit.
In most of the cases, adding 1 to the number gives the solution, 
except if it ends with '9'.
For odd no. of nines, we add 2 Eg. 9+2= 11
For even no. of nines, we add 1 Eg. 99+1=100, 21+1= 22, etc.
*/
