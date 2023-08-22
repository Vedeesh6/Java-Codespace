import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_magicalriddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),count=0,i=1;sc.close();
        while(count<2){
            if((c*i)<a || (c*i)>b){
                System.out.print(c*i+" ");
                count++;
            }
            //System.out.println(i);
            if((c*i)>=a && (c*i)<=b){
                i=b/c;
            }
            i++;
        }
    }
}
