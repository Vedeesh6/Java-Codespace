import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Chef_In_Heaven
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    String s=sc.next();
		    int b=0;
		    int g=0;
		    int i=0;
		    for(i=0;i<n;i++){
		        if(s.charAt(i)=='0'){
		            b++;
		        }
		        else{
		            g++;
		        }
		        if(b<=g){
		            System.out.println("YES");
		            break;
		        }
		    }
		    if(i==n){
		        System.out.println("NO");
		    }
		}

	}
}
