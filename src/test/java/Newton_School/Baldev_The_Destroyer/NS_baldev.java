import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_baldev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),init=sc.nextInt(),count=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]<=init){
                
                count++;
                init+=arr[i];
                //System.out.println(arr[i]+" "+init+" "+count);
            }
            else{
                break;
            }
        }
        System.out.println(count);
    }
}
