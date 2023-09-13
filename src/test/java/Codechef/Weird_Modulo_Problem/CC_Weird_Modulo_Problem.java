/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Weird_Modulo_Problem
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    int ans = arr[0]%arr[1];
		    for(int i=2; i<n; i++){
		        ans %= arr[i];
		    }
		    System.out.println(ans);
		}
	}
}
