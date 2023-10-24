/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_EVM_Hacking
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), p=sc.nextInt(), 
		        q=sc.nextInt(), r=sc.nextInt();
		    int avg = (p+q+r)/2;
		    if((a+b+c)>avg || (p+b+c)>avg || (a+q+c)>avg || (a+b+r)>avg){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
