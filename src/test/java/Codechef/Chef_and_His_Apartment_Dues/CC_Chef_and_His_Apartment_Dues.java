/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Chef_and_His_Apartment_Dues
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt(), ans=0;
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = sc.nextInt();
		    }
		    for(int i=0; i<n; i++){
		        if(arr[i]==0) ans += 1100;
		        else{
		            if(ans-1000 !=0 && ans>0) ans+=100;
		        }
		    }
		    System.out.println(ans);
		}
	}
}
