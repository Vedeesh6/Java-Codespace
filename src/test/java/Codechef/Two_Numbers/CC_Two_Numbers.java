/* Link - https://www.codechef.com/problems/TWONMS */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong(), b = sc.nextLong(), n = sc.nextLong();
            if(n%2==1) a*=2;
            System.out.println(Math.max(a,b)/Math.min(a,b));
        }
	}
}
