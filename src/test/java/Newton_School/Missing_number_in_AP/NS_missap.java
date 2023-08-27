import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_missap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),diff1=0,diff2=0,final_diff=0;
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            if(i==1){
                diff1=arr[1]-arr[0];
            }
            if(i==2){
                diff2=arr[2]-arr[1];
            }
            if(i==3){
                final_diff=arr[3]-arr[2];
                final_diff=(final_diff==diff1)?diff1:diff2;
            }
        }sc.close();
        for(int i=0; i<n-1; i++){
            if(arr[i+1]-arr[i]!=final_diff){
                System.out.println(arr[i]+final_diff);
                break;
            }
        }
    }
}
