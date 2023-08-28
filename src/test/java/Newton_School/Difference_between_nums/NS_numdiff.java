import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_numdiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[3];
        for(int i=0; i<3; i++)
            arr[i]=sc.nextInt();
        sc.close();boolean flag=false;
        for(int i=0; i<3; i++){
            int sum=0;
            for(int j=0; j<3; j++){
                if(i!=j)
                    sum+=arr[j];
            }
            if(sum==arr[i]){
                flag=true;
                break;
            }
        }
        if(flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
