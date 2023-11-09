/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Rock_Paper_Scissor
{
	public static int minRoundsToWin(String A, String B) {
        int n = A.length();
        int chefWins = 0;
        int count=0;
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == 'R' && B.charAt(i) == 'S') {
                chefWins++;
            } else if (A.charAt(i) == 'S' && B.charAt(i) == 'P') {
                chefWins++;
            } else if (A.charAt(i) == 'P' && B.charAt(i) == 'R') {
                chefWins++;
            }
           
        }
        return chefWins;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		   int T=in.nextInt();
		   while(T-->0){
		       int n=in.nextInt();
		       String cheif=in.next();
		       String chefina=in.next();
		       int poinM=minRoundsToWin(cheif,chefina);
		       int poinF=minRoundsToWin(chefina,cheif);
		       if(poinF==poinM){
		           System.out.println(1);
		       }
		       else if(poinM>poinF){
		           System.out.println(0);
		       }
		       else{
		           System.out.println((poinF-poinM)/2 +1);
		       }
		   }
        in.close();
	}
}
