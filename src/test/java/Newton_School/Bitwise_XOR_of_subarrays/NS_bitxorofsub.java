import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_bitxorofsub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            res^=arr[i];
        }
        for(int i=2;i<=n;i++){
            for(int j=0;j<n-i+1;j++){
                int temp=0;
                for(int k=j;k<j+i;k++){
                    temp^=arr[k];
                }
                res^=temp;
            }
        }
        System.out.println(res);
    }
}
