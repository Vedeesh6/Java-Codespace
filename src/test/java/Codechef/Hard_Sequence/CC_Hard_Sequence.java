/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Hard_Sequence
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases > 0) {
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    arr[0] = 0;
		    int temp[] = new int[n];
		    for(int k =0 ;k<n;k++) {
		        temp[k] = -1;
		    }
		    temp[0] = 0;
		    for(int i =0; i<n-1; i++) {
		        int currentIndex = i;
		        int oldIndex = temp[arr[i]];
		        if(oldIndex == -1) {
		            arr[i+1] = 0;
		        }else {
		            arr[i+1] = currentIndex - oldIndex;
		        }
		        //System.out.println(arr[i]);
		        temp[arr[i]] = i;
		    }
		    
		    for(int a =0; a< arr.length ; a++) {
		       // System.out.println(arr[a]);
		    }
		    int count =0 ;
		    for(int m=0 ; m< n; m++) {
		        if(arr[m] == arr[n-1]) {
		            count++;
		        }
		    }
		    System.out.println(count);
		    cases--;
		}
	}
}
