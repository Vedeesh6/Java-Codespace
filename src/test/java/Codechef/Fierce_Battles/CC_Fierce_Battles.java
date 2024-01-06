import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Fierce_Battles
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[101];
            int[] b = new int[101];
            int sum=0, li=0, ci;
            for(int i=0; i<n; i++){
                ci = sc.nextInt();
                li = sc.nextInt();
                if(a[li] != 0){
                    a[li] += ci;
                }
                else{
                    a[li] = ci;
                }
            }
            for(int i=0; i<m; i++){
                ci = sc.nextInt();
                li = sc.nextInt();
                if(b[li] != 0){
                    b[li] += ci;
                }
                else{
                    b[li] = ci;
                }
            }
            for(li=0; li<=100; li++){
                a[li] -= b[li];
                if(a[li]<0) sum+=(-1*a[li]);
            }
            System.out.println(sum);
        }
	}
}
