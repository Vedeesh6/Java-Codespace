import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Chef_and_Stones
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), k = sc.nextInt();
            long max=Integer.MIN_VALUE;
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i=0; i<n; i++) a[i] = sc.nextInt();
            for(int i=0; i<n; i++) b[i] = sc.nextInt();
            for(int i=0; i<n; i++){
                long x=k/a[i];
		        long y=x*b[i];
		        max=Math.max(y,max);
            }
            System.out.println(max);
        }
	}
}
