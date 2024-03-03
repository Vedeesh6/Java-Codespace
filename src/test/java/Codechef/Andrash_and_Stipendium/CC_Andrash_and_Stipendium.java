import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Andrash_and_Stipendium
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), sum=0, full=0, fail=0;
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                if(arr[i]<=2){
                    fail++;
                }
                else if(arr[i]==5){
                    full++;
                }
                sum += arr[i];
            }
            double avg = sum/n;
            if(fail==0 && avg>=4 && full>0){
                System.out.println("Yes");
            }
            else System.out.println("No");
        }
	}
}
