/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Ada_and_Dishes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt(), burner1=0, burner2=0;
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    for(int i=arr.length-1; i>=0; i--){
		        if(burner1<=burner2) burner1 += arr[i];
		        else burner2 += arr[i];
		    }
		    System.out.println(burner1>burner2?burner1:burner2);
		}
	}
}
