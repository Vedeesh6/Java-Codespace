/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Chef_Detective
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int [] arr = new int [n];
        // ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int j=0;j<n;j++){
            arr[j]=sc.nextInt();
            hs.add(arr[j]);
        }
            
        for(int j=0;j<=n;j++){
            if(!hs.contains(j)){
                System.out.println(j);
            }
        }
	}
}
