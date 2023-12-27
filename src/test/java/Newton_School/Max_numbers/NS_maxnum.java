import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_maxnum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            System.gc();
            int n=sc.nextInt(),max=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
            int[] arr=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            for(int i=0;i<n;i++){
                if(arr[i]>max){
                    max3=max2;
                    max2=max;
                    max=arr[i];
                }
                else if(arr[i]>max2){
                    max3=max2;
                    max2=arr[i];
                }
                else if(arr[i]>max3){
                    max3=arr[i];
                }
            }
            System.out.println(max+" "+max2+" "+max3);
        }sc.close();
    }
}
