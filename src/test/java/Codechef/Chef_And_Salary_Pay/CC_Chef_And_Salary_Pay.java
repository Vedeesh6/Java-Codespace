import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Chef_And_Salary_Pay
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    String s = sc.next();
		    int count = 1, max = 0;
		    for(int i = 0; i<s.length()-1; i++){
		         if(s.charAt(i)=='1'&&s.charAt(i+1)=='1')
		            count++;
		            else
		             count = 1;
		             max = Math.max(count,max);
		    }
		    s = s.replaceAll("0","");
		    System.out.println(s.length()*x+max*y);
		}
	}
}
