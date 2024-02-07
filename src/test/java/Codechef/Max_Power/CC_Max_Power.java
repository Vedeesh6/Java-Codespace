import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Max_Power
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int power=0;
        for(int i=n-1; i>=0; i--){
            if(s.charAt(i)=='1'){
                power = n-(i+1);
                break;
            }
        }
        System.out.println(power);
        sc.close();
	}
}
