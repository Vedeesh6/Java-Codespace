/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Broken_Telephone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt(), count=0;
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = sc.nextInt();
		    }
		    if(arr[0] != arr[1]){
		        count++;
		    }
		    if(arr[n-1] != arr[n-2]){
		        count++;
		    }
		    for(int i=1; i<n-1; i++){
		        if(arr[i] != arr[i-01] || arr[i] != arr[i+1]){
		            count ++; 
		        }
		    }
		    System.out.println(count);
		}
	}
}
