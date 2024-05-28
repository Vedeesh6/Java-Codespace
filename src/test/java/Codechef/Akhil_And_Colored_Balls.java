/* Link - https://www.codechef.com/problems/ACBALL */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); 
        while (t-- > 0) {
            String x = scanner.nextLine();
            String y = scanner.nextLine();
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) == y.charAt(i) && x.charAt(i) == 'B') {
                    System.out.print('W');
                } 
                else if(x.charAt(i) == y.charAt(i) && x.charAt(i) == 'W'){
                    System.out.print('B');
                }
                else {
                    System.out.print('B');
                }
            }
            System.out.println();
        }
        scanner.close();
	}
}
