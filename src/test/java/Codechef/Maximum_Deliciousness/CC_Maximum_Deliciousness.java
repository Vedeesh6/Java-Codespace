import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Maximum_Deliciousness
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int  t = sc.nextInt();
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int l = sc.nextInt();
		    List<Integer> pastries = new ArrayList<>();
		    for(int i=0; i<n; i++)
		    {
		        int temp = sc.nextInt();
		        pastries.add(temp);
		    }
		    Collections.sort(pastries, Collections.reverseOrder());
		    long delicious = 0;
		    for(int i=l; i-1<n; )
		    {
		        delicious += pastries.get(i-1);
		        i +=k;
		    }
		    System.out.println(delicious);
		}
	}
}
