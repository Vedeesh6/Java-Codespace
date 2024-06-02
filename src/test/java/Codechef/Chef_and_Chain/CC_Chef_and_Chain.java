import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Chef_and_Chain
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    String ch=sc.next();
		    int n=ch.length();
		    char[] s = ch.toCharArray();
		    char[] x=new char[n];
		    char[] y=new char[n];
		    int cnt1=0,cnt2=0;
		    for(int j=0;j<n;j++){
		            if(j%2==0){
		                    x[j]='+';
		                    y[j]='-';
		            }
		            else{
		                   x[j]='-';
		                    y[j]='+'; 
		            }
		    }
		    for(int j=0;j<n;j++){
		            if(x[j]==s[j]) cnt1++;
		            if(y[j]==s[j]) cnt2++;
		    }
		    System.out.println(Math.min(cnt1,cnt2));
		}
	}
}
