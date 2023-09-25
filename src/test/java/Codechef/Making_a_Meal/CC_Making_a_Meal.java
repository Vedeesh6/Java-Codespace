/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Making_a_Meal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt(), c = 0, o = 0, d = 0, e = 0, h = 0, f = 0;
		    while(n-->0){
		        String s = sc.next();
		        for(int i=0; i<s.length(); i++){
		            switch(s.charAt(i)){
		                case 'c': c++; break;
		                case 'o': o++; break;
		                case 'd': d++; break;
		                case 'e': e++; break;
		                case 'h': h++; break;
		                case 'f': f++; break;
		            }
		        }
		    }
		    int[] arr = {c/2,o,d,e/2,h,f};
		    Arrays.sort(arr);
		    System.out.println(arr[0]);
		}
	}
}
