/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Laddu
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while( t-- > 0 ){
		    int activities = sc.nextInt();    
		    String origin = sc.next();
		    int point = 0;
		    for (int i = 1 ; i <= activities ; i++ ) {
		        String a = sc.next();
		        int r = 0;
		        if( a.equals( "CONTEST_WON" ) || a.equals("BUG_FOUND") ){
		            r = sc.nextInt();
		        }
		        if( a.equals( "CONTEST_WON" ) ){
		            point += 300;
		            if( r <= 20 ){
		                point += 20 - r;
		            }
		        }
		        else if( a.equals( "TOP_CONTRIBUTOR" ) ){
		            point += 300;   
		        }
		        else if( a.equals( "BUG_FOUND" ) ){
		            point += r;   
		        }
		        else if( a.equals( "CONTEST_HOSTED" ) ){
		            point += 50;   
		        }
		    }
		    int ans = 0;
		    if( origin.equals( "INDIAN" ) ){
		        ans = point/200;
		    }
		    else{
		        ans = point/400;
		    }
		    System.out.println(ans);
		}
	}
}
