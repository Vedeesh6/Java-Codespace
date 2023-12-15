/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Three_Powers_of_Two
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    String str = sc.next();
		    
		    int count=0;
		    for(int i=0; i< n ; i++){
		        if(str.charAt(i) == '1')
		        count++;
		    }
		    
		    if(count <= 3 && !str.equals("1") && !str.equals("10"))
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
