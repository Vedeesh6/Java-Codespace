/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Spoon_in_Matrix
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
		    int r = sc.nextInt();
		    int c = sc.nextInt();
		    
		    String[] matrix = new String[r];
		    
		    for(int i=0; i<r; i++) 
		    matrix[i] = sc.next();
		   
		    System.out.println(getSolution(matrix, r, c));
		}
	}
	
	public static String getSolution(String[] matrix, int r, int c) {
	    for(int i=0; i<r; i++) {
	        String str = matrix[i];
	        str = str.toLowerCase();
	        if(str.contains("spoon")) {
	            return "There is a spoon!";
	        }
	    }
	    
	    for(int i=0; i<c; i++) {
	        StringBuilder str = new StringBuilder();
	        for(int j=0; j<r; j++) {
	            str.append(matrix[j].charAt(i));
	        }
	        String s = str.toString().toLowerCase();
	        if(s.contains("spoon")) {
	            return "There is a spoon!";
	        }
	    }
	    
	    return "There is indeed no spoon!";
	}
}
