/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Geometric_Mean_Inequality
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes hereScanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while( t-- > 0 ){
		    int n = sc.nextInt();
		    int pos = 0, neg = 0, a;
		    for(int i = 0; i < n; i++){
		        a = sc.nextInt();
		        if(a > 0) pos++;
		        else neg++;
		    }
		    a = Math.abs(pos - neg);
		    if(a == 0 || a == 1) System.out.println("Yes");
		    else if(a == 2 && pos % 2 == 0) System.out.println("Yes");
		    else System.out.println("No");
		}
	}
}
