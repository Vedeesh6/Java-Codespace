import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Plus_Multiply
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
              int n = sc.nextInt();
		    int count2=0;
		    int count0=0;
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		        if(arr[i]==2){
		            count2++;
		        }
		        if(arr[i]==0){
		            count0++;
		        }
		    }
		    int ans = ((count2*(count2-1))/2+(count0*(count0-1))/2);
		    System.out.println(ans);
		}
	}
}
