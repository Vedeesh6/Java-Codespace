import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_maxpermscore{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();sc.close();
        int count=0,greater=Math.max(x,y);
        for(int i=1;i*greater<=n;i++){
            if((i*greater)%x==0 && (i*greater)%y==0){
                count++;
            }
        }
        int sum=0;
        while(count-->0){
            sum+=n;
            n--;
        }
        System.out.println(sum);
    }
}
