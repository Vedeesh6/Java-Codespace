/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Chef_and_Mean
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++){
		        arr[i] = sc.nextLong();
		    }
		    long sum = Arrays.stream(arr).sum();
		    if(sum%n==0){
		        long a = sum/n, z=0;
		        for(int i=0; i<n; i++){
		            if(arr[i] == a){
		                z++;
		                System.out.println(i+1);
		                break;
		            }
		        }
		        if(z==0){
		            System.out.println("Impossible");
		        }
		    }
		    else{
		        System.out.println("Impossible");
		    }
		}
	}
}
