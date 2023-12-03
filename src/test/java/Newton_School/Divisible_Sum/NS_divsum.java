import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_divsum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),k=sc.nextInt(),sum=0;

        int count=1;
        while(k-->0){
            while(count%a!=0 && count%b!=0){
                count++;
            }
            //System.out.println(count);
            sum+=count;
            count++;
        }
        System.out.println(sum);
    }
}
