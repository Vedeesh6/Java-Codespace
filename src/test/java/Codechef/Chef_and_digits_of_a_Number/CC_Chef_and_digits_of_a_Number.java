/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Chef_and_digits_of_a_Number
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    String s = sc.next();
		    int count = 0;
		    for(int i=0; i<s.length(); i++){
		        if(s.charAt(i) == '1') count++;
		    }
		    if(count==(s.length()-1) || count==1){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}
