import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Favourite_String_of_Chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int a = s.indexOf("code"), b = s.indexOf("chef");
            if(a>b){
                System.out.println("WA");
            }
            else{
                System.out.println("AC");
            }
        }
	}
}
