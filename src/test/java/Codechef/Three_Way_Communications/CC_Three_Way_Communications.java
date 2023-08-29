/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Three_Way_Communications
{
	static double distance(int x1,int y1,int x2,int y2)
    {
        int d1=Math.abs(x1-x2);
        int d2=Math.abs(y1-y2);
        int sqSum=(d1*d1)+(d2*d2);
        double dist = Math.sqrt(sqSum);
        return dist;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0){
		    int r=sc.nextInt();
		    int x1=sc.nextInt(); int y1=sc.nextInt();
		    int x2=sc.nextInt(); int y2=sc.nextInt();
		    int x3=sc.nextInt(); int y3=sc.nextInt();
		    
		    double d1=distance(x1,y1,x2,y2);
		    double d2=distance(x2,y2,x3,y3);
		    double d3=distance(x1,y1,x3,y3);
		    
		    if((d1<=r && d2<=r) || (d2<=r && d3<=r) || (d3<=r && d1<=r)){
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		}
	}
}
