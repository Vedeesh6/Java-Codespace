import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Subsequence_Equality
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            HashSet<Character> hs = new HashSet<>();
            boolean b = false;
            for(int i=0; i<s.length(); i++){
                if(hs.contains(s.charAt(i))){
                    b = true;
                    break;
                }
                else hs.add(s.charAt(i));
            }
            if(b) System.out.println("yes");
            else System.out.println("no");
        }
	}
}
