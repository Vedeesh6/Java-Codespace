/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Jumping_In_The_Hills
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt(), u=sc.nextInt(), d=sc.nextInt(), count=1, c=0;
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = sc.nextInt();
		    }
		    for(int i=0; i<n-1; i++){
		        if(arr[i]==arr[i+1] || (0<arr[i]-arr[i+1] && arr[i]-arr[i+1] <=d) || (0<arr[i+1]-arr[i] && arr[i+1]-arr[i] <=u))
                count++;
                else if(arr[i]-arr[i+1]>d && c!=1){
                    count++; c++;
                }
                else {
                    break;
                }
		    }
		    System.out.println(count);
		}
	}
}
