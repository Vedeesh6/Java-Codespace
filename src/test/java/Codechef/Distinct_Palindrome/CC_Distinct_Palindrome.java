/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Distinct_Palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int N=sc.nextInt();
		    int dis=sc.nextInt();
		    
		    if(N%2==0 && dis>N/2) System.out.println(-1);
		    else if(N%2!=0 && dis>(N+1)/2) System.out.println(-1);
		    else if(N==1 && dis==1) System.out.println('a');
		    else{
		        String ans="";
		        char k='a';
		        
		        for(int i=0;i<dis;i++){
		            ans+=k;
		            k++;
		        }
		        
		        if(N%2==0){
		            char b=ans.charAt(ans.length()-1);
		            for(int i=ans.length();i<N-dis;i++){
		                ans+=b;
		                //k--;
		            }
		            for(int i=0;i<=dis-1;i++){
		                char a=ans.charAt(dis-1-i);
		                ans+=a;
		            }
		        }else{
                char b=ans.charAt(ans.length()-1);
		            for(int i=ans.length();i<=N-dis;i++){
		                ans+=b;
		                //k--;
		            }
		            for(int i=0;i<dis-1;i++){
		                char a=ans.charAt(dis-2-i);
		                ans+=a;
		            }
		        }
		        System.out.println(ans);
		    }
		}
	}
}
