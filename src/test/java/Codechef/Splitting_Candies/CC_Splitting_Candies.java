import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Splitting_Candies
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    long n = sc.nextLong();
		    long k = sc.nextLong();
		    if(k!=0){
		        System.out.println(n/k+" "+n%k);
		    }
		    else{
		        System.out.println(0+" "+n);
		    }
		}
	}
}
