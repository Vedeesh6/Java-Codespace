/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Closing_the_Tweets
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		boolean[] flag = new boolean[n];
		Arrays.fill(flag, false);
		
		for(int i=0; i<k; i++) {
		    String x = sc.next();
		    
		    if(x.length() == 5) {
		        String val = sc.next();
		        
		        int num = Integer.parseInt(val);
		        num--;
		        
		        if(flag[num]) flag[num] = false;
		        else flag[num] = true;
		        
		        int open = 0;
		        
		        for(int j=0; j<n; j++) 
		        if(flag[j]) open++;
		        
		        System.out.println(open);
		    } else {
		        Arrays.fill(flag, false);
		        System.out.println(0);
		    }
		} 
	}
}
