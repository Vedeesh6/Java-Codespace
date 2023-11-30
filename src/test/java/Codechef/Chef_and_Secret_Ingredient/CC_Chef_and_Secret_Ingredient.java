/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Chef_and_Secret_Ingredient
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {

            int n = sc.nextInt();
            int x =sc.nextInt();
            int [] arr = new int [n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[j]>=x){
                    count++;
                }
            }
            if(count>=1){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
	}
}
