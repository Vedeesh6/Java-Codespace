import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Little_Elephant_and_Bombs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int[] arr = new int[n];
            int count = 0;
            if(n==1){
                if(s.charAt(0)=='1') count++;
            }
            else if(n==2){
                if(s.charAt(0)=='1' || s.charAt(1)=='1') count = 2;
            }
            else{
                if(s.charAt(0)=='1'){
                    arr[0]=1;
                    arr[1]=1;
                }
                if(s.charAt(n-1)=='1'){
                    arr[n-1]=1;
                    arr[n-2]=1;
                }
                for(int i=1; i<n-1; i++){
                    if(s.charAt(i)=='1'){
                        arr[i-1] = 1;
                        arr[i] = 1;
                        arr[i+1] = 1;
                    } 
                }
                for(int i=0; i<n; i++){
                    if(arr[i]==1) count++;
                }
            }
            System.out.println(n-count);
        }
	}
}
