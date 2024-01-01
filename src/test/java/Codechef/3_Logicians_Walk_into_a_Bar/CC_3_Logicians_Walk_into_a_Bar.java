import java.util.*;
import java.lang.*;
import java.io.*;

class CC_3_Logicians_Walk_into_a_Bar
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
         Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            String s=sc.next();
            boolean f=true;
            for (int i=0;i<n;i++) {
                if (s.charAt(i)=='1' && f) {
                    if (i==n-1)
                        System.out.println("YES");
                    else
                        System.out.println("IDK");
                } else if (s.charAt(i)=='0' || !f) {
                    System.out.println("NO");
                    f=false;
                }
            }
        }
	}
}
