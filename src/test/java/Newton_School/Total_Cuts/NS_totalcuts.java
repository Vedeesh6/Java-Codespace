import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_totalcuts {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        sc.close();
        int max=arr[0],min=arr[n-1],j=n-2,cut=0;
        for(int i=0;i<n && j>=0;i++){
            if(arr[i]>max) max=arr[i];
            if(arr[j]<min) min=arr[j];
            if(max+min>=k) cut++;
            j--;
        }
        System.out.println(cut);
    }
}
