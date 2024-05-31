/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Divisible_by_K
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    long k = sc.nextInt();
		    long arr[] = new long[n];
		    for(int i = 0; i < n; i++)
		        arr[i] = sc.nextInt();
		    long num = arr[0];
		    boolean flag = true;
		    for(int i = 1; i < n; i++){
		        num = num * arr[i];
		        if(num % k == 0){
		            flag = false; 
		            System.out.println("Yes");
		            break;
		        }
		        num = num % k;
		    }
		    if(flag) System.out.println("No");
		}
	}
}
