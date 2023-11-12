/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Mode_of_Frequencies
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-- > 0){
	        int n = sc.nextInt();
	        int [] frequencies = new int [11];
	        int [] frequencies2 = new int [10001];
	        for(int i = 0; i<n; i++){
	            frequencies[sc.nextInt()] += 1;
	            
	        }
	        for(int i = 1; i<11; i++){
	            frequencies2[frequencies[i]] += 1;
	        }
	        int maxFreq = -1;
	        for(int i = 1; i<10001; i++){
	            maxFreq = Math.max(maxFreq, frequencies2[i]);
	        }
	        for(int i = 1; i<10001; i++){
	            if(frequencies2[i] == maxFreq) {
	                System.out.println(i);
	                break;
	           
	            }
	        }
	    }
	}
}
