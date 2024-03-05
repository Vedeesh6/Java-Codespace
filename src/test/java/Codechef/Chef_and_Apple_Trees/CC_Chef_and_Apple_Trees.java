/* Link - https://www.codechef.com/problems/CAPPLE */

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
            int n = sc.nextInt();
            HashSet<Integer> hs = new HashSet<Integer>();
            for(int i=0; i<n; i++){
                hs.add(sc.nextInt());
            }
            System.out.println(hs.size());
        }
	}
}
