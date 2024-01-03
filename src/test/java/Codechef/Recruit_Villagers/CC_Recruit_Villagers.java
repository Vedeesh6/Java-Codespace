import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Recruit_Villagers
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int c=sc.nextInt();
		int[] x=new int[n];
		int[] y=new int[n];
		int[] p=new int[n];
		int one=0,sec=0;
		for(int i=0;i<n;i++){
		    x[i]=sc.nextInt();
		    y[i]=sc.nextInt();
		    p[i]=sc.nextInt();
		    if(m*x[i]+c-y[i]>0){
		        one += p[i];
		    }
		    else{
		        sec += p[i];
		    }
		}
		System.out.println(Math.max(one, sec));
	}
}
