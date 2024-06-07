/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Cricket_Score
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();

          int [] runs = new int [n];
          int [] wi = new int [n];
          for(int j=0;j<n;j++){
              runs[j]=sc.nextInt();
              wi[j]=sc.nextInt();
          }
          int count=0;
          for(int j=0;j<n;j++){
              if(j>0){
                  if(runs[j]<runs[j-1]){
                      count++;
                  }
                  if(wi[j]<wi[j-1]){
                      count++;
                  }
              }
          }
          for(int j=0;j<n;j++){
            
              if(j<n-1){
                  if(wi[j]==10){
                      count++;
                  }
              }
          }
          if(count==0){
              System.out.println("YES");
          }
          else{
              System.out.println("NO");
          }

	}
}
