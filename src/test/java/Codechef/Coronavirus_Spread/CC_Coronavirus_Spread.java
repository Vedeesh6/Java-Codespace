/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Coronavirus_Spread
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt(), min=100, count=1, max=1;
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = sc.nextInt();
		    }
		    for(int i=0; i<n-1; i++){
		        if(arr[i+1]-arr[i]<=2){
		            count++;
		        }
		        else{
		            if(count>max){
		                max = count;
		            }
		            if(count<min){
		                min = count;
		            }
		            count = 1;
		        }
		    }
		    if(count>max){
		        max = count;
		    }
		    if(count<min){
		        min = count;
		    }
		    System.out.println(min+" "+max);
		}
	}
}
