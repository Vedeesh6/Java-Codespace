/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Chef_and_Subset
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		    int a= sc.nextInt();
		    int b= sc.nextInt();
		    int c= sc.nextInt();
		    int d= sc.nextInt();
		    
		    if(a==0||b==0||c==0||d==0||a+b==0||a+c==0||a+d==0||a+b+c==0||a+b+d==0||a+c+d==0||a+b+c+d==0||b+c==0||b+d==0||b+c+d==0||c+d==0){
                System.out.println("Yes");
             }
             else{
                System.out.println("No");
             }
		}
	}
}
