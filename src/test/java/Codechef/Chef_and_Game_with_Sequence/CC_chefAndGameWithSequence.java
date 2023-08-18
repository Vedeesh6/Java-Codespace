/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_chefAndGameWithSequence
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0){
		    int n = sc.nextInt(), codd=0, ceven=0;
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i]=sc.nextInt();
		        if(arr[i]%2!=0){
		            codd++;
		        }
		        else{
		            ceven++;
		        }
		    }
            if(codd==0){
                System.out.println(1);
            }
            else if(ceven==0 && codd==1){
                System.out.println(1);
            }
            else if(codd%2==0){
                System.out.println(1);
            }
            else if(codd%2!=0){
                System.out.println(2);
            }
		}
	}
}

/*
    Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int i;
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int ar[]=new int[n];
		    int count=0;
		    for(i=0;i<n;i++)
		    {
		        ar[i]=sc.nextInt();
		        if(ar[i]%2!=0)
		            count++;
		        
		    }
		    
		    if(count%2!=0 && n>1) 
		        System.out.println(2);
		    else
		        System.out.println(1);
		}
*/
