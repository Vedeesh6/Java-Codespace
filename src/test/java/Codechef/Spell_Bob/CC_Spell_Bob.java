import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Spell_Bob
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s1 = sc.next(), s2 = sc.next();
            int count = 0;
            if((s1.charAt(0)) == 'b' || (s2.charAt(0) == 'b')){
                if((s1.charAt(1)) == 'o' || (s2.charAt(1) == 'o')){
                    if((s1.charAt(2)) == 'b' || (s2.charAt(2) == 'b')){
                        count++;
                    }
                }
            }
            if((s1.charAt(0)) == 'o' || (s2.charAt(0) == 'o')){
                if((s1.charAt(1)) == 'b' || (s2.charAt(1) == 'b')){
                    if((s1.charAt(2)) == 'b' || (s2.charAt(2) == 'b')){
                        count++;
                    }
                }
            }
            if((s1.charAt(0)) == 'b' || (s2.charAt(0) == 'b')){
                if((s1.charAt(1)) == 'b' || (s2.charAt(1) == 'b')){
                    if((s1.charAt(2)) == 'o' || (s2.charAt(2) == 'o')){
                        count++;
                    }
                }
            }
            if(count>0){
                System.out.println("yes");
            }
            else{
            System.out.println("no");
            }
        }
	}
}
