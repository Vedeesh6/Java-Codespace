/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Cool_Name
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    String s = sc.next(); int ans=0;
		    ArrayList<Integer> al = new ArrayList<>();
		    for(int i=0; i<s.length(); i++){
		        al.add(s.charAt(i)-'a'+1);
		    }
		    Collections.sort(al);
		    for(int i=0; i<al.size(); i++){
		        ans += al.get(i)*(i+1);
		    }
		    System.out.println(ans);
		}
	}
}
