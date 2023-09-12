/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Chef_and_Glove
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt(), n1=0, n2=0;
		    int[] arr = new int[n];
		    int[] arr1 = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = sc.nextInt();
		    }
		    for(int i=0; i<n; i++){
		        arr1[i] = sc.nextInt();
		    }
		    for(int i=0; i<n; i++){
		        if(arr[i]<=arr1[i]){
		            n1++;
		        }
		        if(arr[i]<=arr1[n-1-i]){
		            n2++;
		        }
		    }
		    if(n1==n && n2==n){
		        System.out.println("both");
		    }
		    else if(n1==n && n2!=n){
		        System.out.println("front");
		    }
		    else if(n2==n && n1!=n){
		        System.out.println("back");
		    }
		    else{
		        System.out.println("none");
		    }
		}
	}
}
