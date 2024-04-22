import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Minimum_Sum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0){
           int n=sc.nextInt();
           long arr[]=new long[n];
           for(int i=0;i<n;i++) arr[i]=sc.nextLong();
           Arrays.sort(arr);
           long gd=arr[0];
           for(int i=1;i<n;i++){
               gd=gcd(gd,arr[i]);
           }
           long ans=gd*(long)n;
           System.out.println(ans);
           
       }
	}
	
	public static long gcd(long a, long b){
	    if(b==0){
	        return a;
	    }
	    
	    return gcd(b,a%b);
	}
}
