import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_sortgame{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n],sortarr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sortarr[i]=arr[i];
        }sc.close();
        System.out.println(check(arr,sortarr,n)? "Yes":"No");
    }

    static boolean check(int[] arr,int[] sortarr,int n){
        Arrays.sort(sortarr);
        for(int i=0;i<n;i++){
            if(arr[i]%2!=sortarr[i]%2){
                return false;
            }
        }
        return true;
    }
}
