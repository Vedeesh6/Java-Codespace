/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Chef_and_Notebooks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        
        
        while(test --> 0) {
            int[] x = new int[4];
            for (int i = 0; i < x.length; i++) {
                x[i] = sc.nextInt();
            }
            boolean t = false;
            
            for(int i = 0; i < x[3]; i++) {
                int pi = sc.nextInt();
                int ci = sc.nextInt();

                if((x[1]+pi)>=x[0] && ci <= x[2]){
                    t = true;
                  
                }
            }
            if(t)
            System.out.println("LuckyChef");
            else
            System.out.println("UnluckyChef");
            

        }
	}
}
