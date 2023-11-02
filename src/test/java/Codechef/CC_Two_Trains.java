/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Two_Trains
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt(), sum=0, max=0;
		    int[] arr = new int[n-1];
		    for(int i=0; i<n-1; i++){
		        arr[i] = sc.nextInt();
		        sum += arr[i];
		        max = Math.max(arr[i], max);
		    }
		    System.out.println(sum+max);
		}
	}
}
