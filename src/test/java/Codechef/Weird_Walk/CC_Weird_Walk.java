import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Weird_Walk
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
		    int a[] = new int[n];
		    int b[] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i] = sc.nextInt();
		    }
		    for(int i=0;i<n;i++)
		    {
		        b[i] = sc.nextInt();
		    }
		    long suma = 0 , sumb = 0;
		    long ans = 0;
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]==b[i] && suma==sumb)
		            ans = ans + a[i];
		        suma+=a[i];
		        sumb+=b[i];
		    }
		    System.out.println(ans);
        }
	}
}
