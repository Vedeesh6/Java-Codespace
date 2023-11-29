/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Bear_and_Milky_Cookies
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            String A[] = new String[N];
            for(int i = 0; i < N; i++){
                A[i] = sc.next();
            }
            if(A[N - 1].equals("cookie")){
                System.out.println("NO");
            }
            else{
                boolean isValid = true;
                for(int i = 0; i < N - 1; i++){
                    if(A[i].equals("cookie") && A[i + 1].equals("cookie")){
                        isValid = false;
                        break;
                    }
                }            
                if(isValid){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
        sc.close();
	}
}
