import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Transform_the_Expression
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next(), ans = "";
            Stack<Character> st = new Stack<>();
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)!='(' && s.charAt(i)!=')' && s.charAt(i)-'a'<0){
                    st.push(s.charAt(i));
                } else if(s.charAt(i)!='(' && s.charAt(i)!=')'){
                    ans += s.charAt(i);
                } 
                if(s.charAt(i)==')') ans += st.pop();
            }
            System.out.println(ans);
        }
	}
}
