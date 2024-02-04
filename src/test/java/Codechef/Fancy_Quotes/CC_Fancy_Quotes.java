import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Fancy_Quotes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String[] str = sc.nextLine().split(" ");
            boolean b = false;
            for(String s: str){
                if(s.equals("not")){
                    b = true;
                    break;
                }
            }
            if(b) System.out.println("Real Fancy");
            else System.out.println("regularly fancy");
        }
	}
}
