import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Check_Algorithm
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            String ans = "";
            int count = 1;
            if(s.length()==1){
                System.out.println("NO");
            }
            else{
                for(int i=0; i<s.length()-1; i++){
                    if(s.charAt(i)==s.charAt(i+1)){
                        count++;
                    }
                    else{
                        ans = ans+s.charAt(i)+String.valueOf(count);
                        count = 1;
                    }
                }
                if(s.charAt(s.length()-1) != s.charAt(s.length()-2)){
                    ans = ans + s.charAt(s.length()-1) + "1";
                }
                if(s.charAt(s.length()-1) == s.charAt(s.length()-2)){
                    ans += s.charAt(s.length()-1) + String.valueOf(count);
                }
                if(ans.length()<s.length()){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
	}
}
