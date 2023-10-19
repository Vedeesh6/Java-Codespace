/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Santa_and_Chocolates
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), k =sc.nextInt(), sum = 0;
            for(int i=0; i<n; i++){
                sum += sc.nextInt();
            }
            if(sum<n){
                System.out.println("NO");
            }
            else{
                if(sum%n!=0 && k==0){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
            }
        }
    }
}
