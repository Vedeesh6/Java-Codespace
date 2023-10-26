/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Chef_in_Fantasy_League
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt(), s = sc.nextInt(), min0=101, min1=101;
		    int[] arr = new int[2*n];
		    for(int i=0; i<2*n; i++){
		        arr[i] = sc.nextInt();
		    }
		    for(int i=n; i<2*n; i++){
		        if(arr[i]==0){
		            if(arr[i-n]<min0){
		                min0 = arr[i-n];
		            }
		        }
		        else{
		            if(arr[i-n]<min1){
		                min1 = arr[i-n];
		            }
		        }
		    }
		    System.out.println((s+min0+min1)<=100?"yes":"no");
		}
	}
}
