/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Strong_Language
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    String str = sc.next();
		  int count = 0;
		  for(int i = 0; i<n; i++){
		      if(str.charAt(i) == '*'){
		          count++;
		          if(count == k){
		              break;
		          }
		      }
		      else{
		          count = 0;
		      }
		  }
		  if(count == k){
		      System.out.println("Yes");
		  }
		  else{
		      System.out.println("No");
		  }
		    
		}
	}
}
