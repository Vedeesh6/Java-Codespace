/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_The_Attack_Of_Queen
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt(), x=sc.nextInt(), y=sc.nextInt();
		    int sum = n-1+n-1;
		    sum += Math.min(Math.abs(x-1),Math.abs(y-1));
		    sum += Math.min(Math.abs(x-1),Math.abs(y-n));
		    sum += Math.min(Math.abs(x-n),Math.abs(y-1));
		    sum += Math.min(Math.abs(x-n),Math.abs(y-n));
		    System.out.println(sum);
		}
	}
}

/*
            int N=sc.nextInt();
		    int X=sc.nextInt();
		    int Y=sc.nextInt();
		    int c=2*N-2;
		    int tempx=X-1;
		    int tempy=Y-1;
		    while(tempx>=0 && tempy>=0 && tempx<N && tempy<N){
		        c++;
		        tempx--;
		        tempy++;
		    }
		    tempx=X-1;
		    tempy=Y-1;
		    while(tempx>=0 && tempy>=0 && tempx<N && tempy<N){
		        c++;
		        tempx++;
		        tempy--;
		    }
		    tempx=X-1;
		    tempy=Y-1;
		    while(tempx>=0 && tempy>=0 && tempx<N && tempy<N){
		        c++;
		        tempx--;
		        tempy--;
		    }
		    tempx=X-1;
		    tempy=Y-1;
		    while(tempx>=0 && tempy>=0 && tempx<N && tempy<N){
		        c++;
		        tempx++;
		        tempy++;
		    }
		    System.out.println(c-4);
*/
