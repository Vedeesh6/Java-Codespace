/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Vaccine_Distribution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt(), d = sc.nextInt(), risk=0, notrisk=0, days=0;
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = sc.nextInt();
		        if(arr[i]>=80 || arr[i]<=9) risk++;
		        else notrisk++;
		    }
		    if(risk%d==0) days += risk/d;
		    else days += risk/d + 1;
		    if(notrisk%d==0) days += notrisk/d;
		    else days += notrisk/d + 1;
		    System.out.println(days);
		}
	}
}
