/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Asymmetric_Swaps
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int[] arr = new int[2*n];
		    for(int i=0; i<2*n; i++){
		        arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    int min = Integer.MAX_VALUE;
		    for(int i=2*n-1; i>=n-1; i--){
		        min = Math.min(min, arr[i]-arr[i-n+1]);
		    }
		    System.out.println(min);
		}
	}
}
