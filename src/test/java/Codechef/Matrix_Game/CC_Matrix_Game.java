import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Matrix_Game
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(), m=sc.nextInt(), sum=0, sum1=0;
            int[] arr = new int[n*m];
            for(int i=0; i<m*n; i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            Arrays.sort(arr);
            for(int i=m*n-1; i>=0; i-=2){
                sum1 += arr[i]; 
            }
            if(sum1 > sum-sum1) System.out.println("Cyborg");
            else if(sum1 == sum-sum1) System.out.println("Draw");
            else System.out.println("Geno");
        }
	}
}
