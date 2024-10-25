import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Watermelon
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), sum=0;
            for(int i=0; i<n; i++) sum+=sc.nextInt();
            if(sum<0) System.out.println("NO");
            else System.out.println("YES");
        }
	}
}
