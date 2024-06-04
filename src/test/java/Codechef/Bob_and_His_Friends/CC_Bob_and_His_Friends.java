/* Link - https://www.codechef.com/problems/BFRIEND */

import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Bob_and_His_Friends
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
		for(int i=0;i<T;i++){
		    int N = sc.nextInt();
		    long a = sc.nextLong();
		    long b = sc.nextLong();
		    long c = sc.nextLong();
		    long[] A = new long[N];
		    for(int j=0;j<N;j++){
		        A[j] = sc.nextLong();
		    }
		    long ans = Math.abs(A[0]-a)+Math.abs(A[0]-b)+c;
		    for(int k=1;k<N;k++){
		        long sol = Math.abs(A[k]-a)+Math.abs(A[k]-b)+c;
		        if(sol<ans){
		            ans = sol;
		        }
		    }
		    System.out.println(ans);
		}
	}
}
