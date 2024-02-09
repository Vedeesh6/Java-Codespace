import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Chef_And_His_Characters
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next(), check = "cefh";
            int count = 0;
            for(int i=0; i<s.length()-3; i++){
                int subcount = 0;
                String subString = s.substring(i,i+4);
                char[] ch = subString.toCharArray();
                Arrays.sort(ch);
                for(int j=0; j<4; j++){
                    if(ch[j] == check.charAt(j)){
                        subcount++;
                    }
                }
                if(subcount==4) count++;
            }
            if(count>0){
                System.out.println("lovely "+count);
            }
            else{
                System.out.println("normal");
            }
        }
	}
}
