import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class NS_reducearrayintorank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        sc.close();
        int[] copy=new int[n];
        for(int i=0;i<n;i++) copy[i]=arr[i];
        Arrays.sort(copy);
        int[] det=new int[n+1];int k=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                //System.out.println(arr[i]+" "+copy[j]);
                if(arr[i]==copy[j]) {
                    det[k]=j;
                    copy[j]=-1;
                    break;
                }
            }
            k+=1;
        }
        for(int i=0;i<n;i++) {
            System.out.print(det[i]+" ");
        }
    }
}
