import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Array_Equality
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int maxCount=0, nn, count=0;
            boolean b = true;
            if(n%2 != 0) nn = n/2+1;
            else nn = n/2;
            for(int i=0; i<n; i+=count){
                count = 0;
                for(int j=i; j<n; j++){
                    if(arr[i]==arr[j]) count++;
                    else break;
                }
                if(count>maxCount) maxCount = count;
            }
            if(maxCount<=nn) System.out.println("YES");
            else System.out.println("NO");
        }
	}
}
