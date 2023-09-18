/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Average_Number
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt(), k=sc.nextInt(), v=sc.nextInt(), sum=0;
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = sc.nextInt();
		        sum+=arr[i];
		    }
		    if(((n+k)*v-sum)%k == 0 && ((n+k)*v-sum)>0){
		        System.out.println(((n+k)*v-sum)/k);
		    }
		    else{
		        System.out.println(-1);
		    }
		}
	}
}
