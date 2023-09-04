/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Bi_lindrome!
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int N = sc.nextInt();
		    String s= sc.next();
		    int flag=1;
		    for(int i=0;i<N-1;i++){
		        for(int j=i+1;j<N;j++){
		            if(s.charAt(i)==s.charAt(j)){
		                flag=0;
		                break;
		            }
		        }
		    }
		    if(flag==0){
		        System.out.println(N-2);
		    }
		    else{
		        System.out.println(-1);
		    }
		}
	}
}
