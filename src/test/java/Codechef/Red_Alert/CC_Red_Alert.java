import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Red_Alert
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), d = sc.nextInt(), h = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int count = 0;
            boolean bool = false;
            for(int i=0; i<n; i++){
                if(arr[i]>0){
                    count += arr[i];
                }
                else if(arr[i] == 0){
                    count -= d;
                    if(count<0) count = 0;
                }
                if(count>h){
                    bool = true;
                    break;
                }
            }
            System.out.println(bool?"YES":"NO");
        }
	}
}
