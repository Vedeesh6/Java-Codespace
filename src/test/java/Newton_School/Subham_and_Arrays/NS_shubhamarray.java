import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_shubhamarray {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),x=scanner.nextInt(),count_odd=0,count_even=0;
        for(int i=0;i<n;i++){
            int temp=scanner.nextInt();
            if(temp%2==0){count_even++;}
            else{count_odd++;}
        }scanner.close();
        if(count_odd==0 || (count_even==0 && x%2==0) || (count_odd==count_even && (n/2)%2==0 && x==n)){System.out.println("No");}
        else{System.out.println("Yes");}
    }
}
