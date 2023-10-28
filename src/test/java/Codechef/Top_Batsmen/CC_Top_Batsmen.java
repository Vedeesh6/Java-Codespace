/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Top_Batsmen
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int[] fact= new int[]{1,1,2,6,24,120,720,5040,40320,362880,3628800,39916800};
		    int[] arr = new int[11];
		    for(int i=0; i<11; i++){
		        arr[i] = sc.nextInt();
		    }
		    int k = sc.nextInt(), n=0, m=0;
		    Arrays.sort(arr);
		    for(int i=10; i>=0; i--){
		        if(arr[i]==arr[11-k]){
		            if(i<11-k) m++;
		            n++;
		        }
		    }
		    int num = fact[n], den = fact[m]*fact[n-m];
		    System.out.println(num/den);
		}
	}
}
