import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Buggy_Calculator
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), m = sc.nextInt(), l=0;
            String s1 = String.valueOf(n), s2 = String.valueOf(m), s="";
            if(s1.length()<s2.length()){
                l = s2.length()-s1.length();
                s += s2.substring(0,l);
                for(int i=0; i<s1.length(); i++){
                    int sum = (Character.getNumericValue(s1.charAt(i)) + Character.getNumericValue(s2.charAt(l + i))) % 10;
                    s += sum;
                }
            }
            else{
                l = s1.length()-s2.length();
                s += s1.substring(0,l);
                for (int i = 0; i < s2.length(); i++) {
                    int sum = (Character.getNumericValue(s1.charAt(l + i)) + Character.getNumericValue(s2.charAt(i))) % 10;
                    s += sum;
                }
            }
            System.out.println(Integer.parseInt(s));
        }
	}
}
