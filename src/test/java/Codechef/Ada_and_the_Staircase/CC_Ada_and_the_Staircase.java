/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Ada_and_the_Staircase
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0 ; i<n ; i++)
		{
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int arr[] = new int[a];
		    for(int j = 0 ; j<a ; j++)
		    {
		        arr[j] = sc.nextInt();
		    }
		    int count = 0;
		    if(arr[0]>b)
		    {
		        count = count+(arr[0]-1)/b;
		    }
		    for(int k = 0 ; k<arr.length-1 ; k++)
		    {
		        if(arr[k+1]-arr[k]>b)
		        {
		            count = count+((arr[k+1]-arr[k]-1)/b);
		        }
		    }
		    System.out.println(count);
		}
	}
}
