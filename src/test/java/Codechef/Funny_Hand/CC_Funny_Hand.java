import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Funny_Hand
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int ans = 0;
		    if(Math.abs(a-b) == 1){
		        if(a == 1 || b == 1 || a == n || b == n){
		            ans = 1;
		        }
		        else{
		            ans = 2;
		        }
		    }
		    else if(Math.abs(a-b) == 2){
		        ans = 1;
		    }
		    else ans = 0;
		    System.out.println(ans);
		}
	}
}
