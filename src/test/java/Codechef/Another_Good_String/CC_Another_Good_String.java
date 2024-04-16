import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Another_Good_String
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int  n = sc.nextInt();
		    int k = sc.nextInt();
		    String s = sc.next();
		    char ch = s.charAt(0);
		    int count =1,max=1;
		    for(int i =1 ; i < n; i++){
		        if(ch == s.charAt(i)){
		            ch = s.charAt(i);
		            count++;
		            max = Math.max(count,max);
		        }
		        else{
		            ch =s.charAt(i);
		            count=1;
		            
		        }
		    }
		  ArrayList<Integer> brr = new ArrayList<>();
		  brr.add(max);
		  for(int i  = 0 ; i  < k ;i++)
		  {
		      char cha = sc.next().charAt(0);
		      if(cha == ch){
		          count++;
		          ch = cha;
		          max = Math.max(count,max);
		      }
		      else{
		          ch = cha;
		          count=1;
		          
		      }
		      brr.add(max);
		  }
		  for(int i : brr){
		      System.out.print(i+" ");
		  }
		  System.out.println();
		}

	}
}
