/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_String_Game
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
		    int n = sc.nextInt();
		    char ch[] = sc.next().toCharArray();
		    Arrays.sort(ch);
		    if(n%2!=0){
		        System.out.println("NO");
		        continue;
		    }
		    char f='0';
		    for(int j=0;j<n;j+=2){
		        if(ch[j]!=ch[j+1]){
		            f='1';
		            break;
		        }
		    }
		    if(f=='0')
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
	}
}
