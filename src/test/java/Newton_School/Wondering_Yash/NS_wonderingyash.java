import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_wonderingyash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                if(i!=n/i)
                    count++;
            }
        }
        System.out.println(count);
    }
}
