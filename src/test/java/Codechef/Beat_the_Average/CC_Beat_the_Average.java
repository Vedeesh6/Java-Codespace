import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Beat_the_Average
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt();
            if(m<=x){
                System.out.println(0);
            }
            else{
                System.out.println((n*x)/(x+1));
            }
        }
	}
}
