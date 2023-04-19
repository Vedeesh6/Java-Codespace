import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_fair {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=0,max1=0;
        int[] arr=new int[4];
        for(int k=0;k<4;k++){
            arr[k]=sc.nextInt();
        }sc.close();
        max=Math.max(arr[0], arr[1]);
        max1=Math.max(arr[2], arr[3]);
        Arrays.sort(arr);
        int i=arr[3],j=arr[2];
        System.out.println(((max==i && max1==j) || (max==j && max1==i)) ? "Yes" : "No");
    }
}
