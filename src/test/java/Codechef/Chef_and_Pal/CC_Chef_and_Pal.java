import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Chef_and_Pal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = "";
            if(n%2==0){
                for(int i=0; i<n/2; i++){
                    s += "10";
                }
                System.out.println(s);
            }
            else{
                System.out.println(-1);
            }
        }
	}
}
