import java.util.*;
import java.lang.*;
import java.io.*;

class CC_ORST
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), m=sc.nextInt(), max=0;
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];
            for(int i=0; i<n; i++){
                arr1[i] = sc.nextInt();
            }
            for(int i=0; i<m; i++){
                arr2[i] = sc.nextInt();
                if(arr2[i]>=max) max=arr2[i];
            }
            if(max>n){
                Arrays.sort(arr1, 0, n);
            }
            else{
                Arrays.sort(arr1, n-max, n);
            }
            for(int i=0;i<n;i++){
		        System.out.print(arr1[i]+" ");
		    }
		    System.out.println();
        }
	}
}
