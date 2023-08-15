/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_cuttingRecipes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0){
		    int n = sc.nextInt(), min=10000;
		    int[] arr = new int[n];
		    int[] ans = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i]=sc.nextInt();
		        if(arr[i]<min){
		            min = arr[i];
		        }
		    }
		    for(int j=1;j<=min;j++){
		        int check = 1;
		        for(int c=0; c<n; c++){
		            if(arr[c]%j!=0)
		            check=0;
		        }
		        if(check==1){
		            for(int k=0; k<n; k++){
		                ans[k]=arr[k]/j;
		            }
		        }
		    }
		    
		 for(int i=0;i<n;i++){
		    System.out.print(ans[i]+" ");
		 }
		 System.out.println();
		}
	}
}

/*
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0){
		    int N = sc.nextInt();
		    int X = 1;
		    int[] ingredients = new int[N];
		    
		    for(int i=0; i<N; i++){
		        ingredients[i] = sc.nextInt();
		        if(i>0 ){
		            if(i ==1){
		                X = HCF(ingredients[0], ingredients[1]);
		            }else{
		                X = HCF(ingredients[i], X);
		            }
		        }    
		    }
		    for(int i=0; i<N; i++){
		        System.out.print(ingredients[i]/X + " ");
		    }
		    System.out.println();
		    T--;
		}
	}
	static int HCF(int x, int y)
    {
        // Everything is divisible by 0
        if (x == 0)
            return y;
        if (y == 0)
            return x;
  
        // Both the numbers are equal
        if (x == y)
            return x;
  
        // x is greater
        if (x > y)
            return HCF(x - y, y);
        return HCF(x, y - x);
    }
}

*/
