import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_nonthree {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),j=1,i=0;sc.close();
        int[] arr = new int[n];
        while(i<n) {
            if((j+"").charAt((j+"").length()-1)!='3' && j%3!=0){
                arr[i]=j;i++;
            }
            j++;
        }
        System.out.println(arr[n-1]);
    }
}
