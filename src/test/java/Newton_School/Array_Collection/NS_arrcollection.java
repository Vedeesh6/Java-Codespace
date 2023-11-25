import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_arrcollection{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0 ; i<n ; i++) arr[i]=sc.nextInt();
        int k=sc.nextInt(),index=-1;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0 ; i<n ; i++){
            if(arr[i]<=k && index==-1){
                index=i;
            }
            if(index!=-1 && arr[i]<=k){
                set.add(arr[i]);
            }
        }
        boolean flag=true;
        for(int i=1 ; i<=k ; i++){
            if(!set.contains(i)){
                flag=false;
                break;
            }
        }
        if(flag) System.out.println(arr.length-index);
        else System.out.println(0);
    }
}
