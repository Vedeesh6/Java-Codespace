/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Pairing_Chefs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    
		    Pair[] arr = new Pair[m];
		    
		    for(int i=0; i<m; i++) {
		        int x = sc.nextInt();
		        int y = sc.nextInt();
		        
		        arr[i] = new Pair(x,y);
		    }
		    
		    boolean[] vis = new boolean[n];
		    Arrays.fill(vis, false);
		    
		    ArrayList<Integer> ans = new ArrayList<>();
		    
		    for(int i=m-1; i>=0; i--) {
		        Pair temp = arr[i];
		        if(!vis[temp.first] && !vis[temp.second]) {
		            ans.add(i);
		            vis[temp.first] = true;
		            vis[temp.second] = true;
		        }
		    }
		    
		    for(int i=ans.size() - 1; i>=0; i--) 
		    System.out.print(ans.get(i) + " ");

		    System.out.println();
		}
	}
	
	static class Pair {
	    int first;
	    int second;
	    public Pair(int first, int second) {
	        this.first = first;
	        this.second = second;
	    }
	}
}
