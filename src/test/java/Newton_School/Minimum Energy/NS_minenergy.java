import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_minenergy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        long mean=Math.round((sum*1.0)/n),distfromall=0;
        //System.out.println(mean);
        for(int i=0;i<n;i++){
            long dist=arr[i]-mean;
            //System.out.println(dist);
            distfromall+=Math.pow(dist,2);
        }
        System.out.println(distfromall);

    }
}
