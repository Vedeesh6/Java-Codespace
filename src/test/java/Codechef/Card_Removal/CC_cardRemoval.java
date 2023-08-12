/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class CC_cardRemoval
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while (t-->0){
	        int n = sc.nextInt(), count=1, max=1;
	        int[] arr = new int[n];
	        for(int i=0; i<n; i++){
	            arr[i]=sc.nextInt();
	        }
	        Arrays.sort(arr);
	        for(int j=0; j<n-1; j++){
	            if(arr[j]==arr[j+1]){
	                count++;
	            }
	            else{
	                count = 1;
	            }
	            if(count>max){
	                max = count;
	            }
	        }
	        System.out.println(n-max);
	    } 
	}
}
