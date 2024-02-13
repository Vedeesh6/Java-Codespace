import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Longest_Common_Pattern
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
          Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            int[] ch1 = new int[128]; 
            int[] ch2 = new int[128]; 
            int count = 0;
            for (int i = 0; i < s1.length(); i++) {
                ch1[s1.charAt(i)]++; 
            }
            for (int i = 0; i < s2.length(); i++) {
                ch2[s2.charAt(i)]++;
            }
            for (int i = 0; i < 128; i++) {
                count += Math.min(ch1[i], ch2[i]); 
            }
            System.out.println(count);
        }
	}
}
