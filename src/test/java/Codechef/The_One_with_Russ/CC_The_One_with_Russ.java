/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_The_One_with_Russ
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt(), x=sc.nextInt(), k=sc.nextInt(), count=0;
		    int[] arr1 = new int[n];
		    int[] arr2 = new int[n];
		    for(int i=0; i<n; i++){
		        arr1[i] = sc.nextInt();
		    }
		    for(int i=0; i<n; i++){
		        arr2[i] = sc.nextInt();
		    }
		    for(int i=0; i<n; i++){
		        if(Math.abs(arr1[i]-arr2[i])<=k) count++;
		    }
		    System.out.println(count>=x?"YES":"NO");
		}
	}
}
