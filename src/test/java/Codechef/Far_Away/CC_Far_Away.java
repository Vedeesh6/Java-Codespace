/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Far_Away
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			long sum = 0 ;
			
			int[] arr = new int[n]; 
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				if (Math.abs(m - arr[i]) > arr[i]-1) {
					sum += Math.abs(m - arr[i]) ;
				} 
				else {
					sum += (arr[i]-1) ;
				}
			}
			System.out.println(sum);
		}	
	}
}
