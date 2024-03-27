import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Approximately
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int num = 103993, den = 33102;
            StringBuffer sb = new StringBuffer();
            for(int i=0; i<=n; i++){
                if(i==1) sb.append(".");
                sb.append(num/den);
                num = (num%den)*10;
            }
            System.out.println(sb);
        }
	}
}
