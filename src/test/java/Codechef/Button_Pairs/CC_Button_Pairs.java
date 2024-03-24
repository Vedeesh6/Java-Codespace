import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Button_Pairs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextInt(), odd=0, even=0;
            for(int i=0; i<n; i++){
                int j = sc.nextInt();
                if(j%2==0) even++;
                else odd++;
            }
            System.out.println(odd*even);
        }
	}
}
