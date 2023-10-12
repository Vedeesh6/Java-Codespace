import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_makeseqeven {

    static int min_elimination(int n, int arr[])
{
    int countOdd = 0;
 
    // Stores the new value
    for (int i = 0; i < n; i++)
 
        // Count odd numbers
        if (arr[i] % 2 == 1)
            countOdd++;
 
    // Return the minimum of even 
    // and odd count
    return Math.min(countOdd, n - countOdd);
}
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(min_elimination(n,arr));
    }
}
