/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Breaking_Bricks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int s=sc.nextInt(), w1=sc.nextInt(), w2=sc.nextInt(), w3=sc.nextInt(), count=0;
		    if(w1+w2+w3<=s)
	          System.out.println(1);
	        else if(w1+w2<=s||w3+w2<=s)
	          System.out.println(2);
	        else
	          System.out.println(3);
		}
	}
}

/* 
class CC_Breaking_Bricks
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner s=new Scanner(System.in);
	   int t=s.nextInt();
	   while(t-->0){
	       int st=s.nextInt();
	       int []w=new int[3];
	       for(int i=0;i<3;i++){
	           w[i]=s.nextInt();
	       }
	           System.out.println(topToBottom(st,w));
	       }
	   }
	   public static int topToBottom(int st,int w[]){
	       int sum=0;
	       int ans=0;
	       for(int i=0;i<3;i++){
	           sum+=w[i];
	       }
	       int mx=Math.max(w[0],w[2]);
	       ans=(sum<=st)?1:((sum-mx)<=st)?2:3;
	       return ans;
	   }
	
}
*/
