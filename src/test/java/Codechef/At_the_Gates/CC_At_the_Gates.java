import java.util.*;
import java.lang.*;
import java.io.*;

class CC_At_the_Gates
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
      Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    char[] coin = new char[n];
		    
		    for(int i=0; i<n; i++) 
		    coin[i] = sc.next().charAt(0);
		    
		    int ans = 0;
		    int cunt = 0;
		    
		    for(int i=n-1; i>=(n-k); i--) {
		        if(coin[i] == 'H') {
		            change(coin, n);
		        }
		    }
		    
		    for(int i=0; i<n-k; i++) {
		        if(coin[i] == 'H') ans++;
		    }
		    
		    System.out.println(ans);
		}
	}
	
	public static void change(char[] coin, int n) {
	    for(int i=0; i<n; i++) {
	        if(coin[i] == 'H') coin[i] = 'T';
	        else coin[i] = 'H';
	    }
	}
}
