import java.util.*;
import java.lang.*;
import java.io.*;

class CC_A_PLUS_B_Remastered
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		    int n= sc.nextInt();
		    int[] a= new int[n];
		    int[] b= new int[n];
		    for(int i=0; i<n; i++){
		        a[i]= sc.nextInt();
		    }
		    for(int i=0; i<n; i++){
		        b[i]= sc.nextInt();
		    }
		    Arrays.sort(a);
		    Arrays.sort(b);
		    boolean flag= true;
    	    for(int i=0; i<n-1; i++){
    	        if((a[i]+b[n-i-1])!=(a[i+1]+b[n-i-2])){
    	            flag= false;
    	            break;
    	        }
    	    }
    	    if(!flag){
    	        System.out.println(-1);
    	    }
    	    else{
    	        for(int i=0; i<n; i++){
    	            System.out.print(a[i]);
    	            System.out.print(" ");
    	        }
    	        System.out.println();
    	        for(int i=n-1; i>=0; i--){
    	            System.out.print(b[i]);
    	            System.out.print(" ");
    	        } 
    	        System.out.println();
    	    }
		}

	}
}
