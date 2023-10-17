/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Hotel_Bytelandia
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt(), count=0, c=0;
	        int arr[]=new int[n];
	        int dep[]=new int[n];
	        for(int i=0; i<n; i++){
	            arr[i] = sc.nextInt();
	        }
	        for(int i=0; i<n; i++){
	            dep[i] = sc.nextInt();
	        }
	        Arrays.sort(arr);
	        Arrays.sort(dep);
	        for(int i=0; i<n; i++){
	            if(arr[i]<dep[c]) count++;
	            else c++;
	        }
	        System.out.println(count);
		}
	}
}
