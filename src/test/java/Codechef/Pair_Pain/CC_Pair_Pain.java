/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Pair_Pain
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while(T-->0){
		    int n = in.nextInt();
		    long ans = 0, n2 = 0 , n1=0;
		    
		    for(int i=0;i<n;i++){
		        int num = in.nextInt();
		        if(num==1){
		            n1++;
		        }
		        else if(num == 2)
		            n2++;
		    }
		    
		    ans += (n-n1)*n1;
		    ans += (n1*(n1-1))/2;
		    ans += (n2*(n2-1))/2;
		    
		    System.out.println(ans);
		    
		}
	}
}
