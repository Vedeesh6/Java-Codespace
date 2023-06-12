import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_smallestduplicatenum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int x = 0; x < n; x++) {
            arr[x] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);boolean flag = false;int x=0;
        for(x = 0; x < n-1; x++) {
            if(arr[x] == arr[x+1]) {
                flag=true;break;
            }
        }
        System.out.println(flag?arr[x]:-1);
    }
}
