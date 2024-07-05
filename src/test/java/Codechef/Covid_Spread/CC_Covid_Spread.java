/* Link - https://www.codechef.com/problems/COVSPRD */

import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Covid_Spread
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), d = sc.nextInt(), count=1;
            for(int i=1; i<=d; i++){
                if(i<=10) count *= 2;
                else count *= 3;
                if(count>=n){
                    count = n;
                    break;
                }
            }
            System.out.println(count);
        }
	}
}
