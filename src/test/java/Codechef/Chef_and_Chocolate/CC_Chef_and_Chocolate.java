import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Chef_and_Chocolate
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), m = sc.nextInt();
            if(n%2!=0 && m%2!=0){
               System.out.println("No");
            }
            else System.out.println("Yes");
        }
	}
}
