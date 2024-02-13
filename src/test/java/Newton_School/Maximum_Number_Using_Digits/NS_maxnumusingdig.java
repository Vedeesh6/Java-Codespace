import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_maxnumusingdig {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        // reverse sort the array
        Arrays.sort(arr);
        if(arr[0]!=0){
            System.out.println(-1);
            return;
        }
        String s="";
        for(int i=n-1;i>=0;i--) s+=arr[i];
        System.out.println(s);
    }
}
