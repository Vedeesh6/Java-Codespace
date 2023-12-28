/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Phone_Prices
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int[] prices=new int[n];
		    for(int i=0;i<n;i++){
		        prices[i]=sc.nextInt();
		    }
		    int count=1,k=0,incount=0;
		     int min = prices[0];
	        for(int i = 1; i<5; i++){
	            if(prices[i]<min){
	                count++;
	                min = prices[i];
	            }
	        }
		    for(int i=5;i<n;i++){
		        for(int j=k;j<i;j++){
		            if(prices[i]<prices[j])incount++;
		            else{
		                break;
		            }
		        }
		        k++;
		        if(incount==5)count++;
		        incount=0;
		    }
		    System.out.println(count);
		}
	}
}
