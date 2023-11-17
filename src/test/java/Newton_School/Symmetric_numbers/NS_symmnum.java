import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_symmnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.close();
        if(n<=1000){
            n=Math.min(n,99);
            System.out.println(n/11);
        }
        else{
            int count=0;
            for(int i=1001;i<=n;i++){
                String arg=i+"";
                if(arg.length()%2!=0) continue;
                int sum_firsthalf=0,sum_secondhalf=0;
                for(int j=0;j<arg.length()/2;j++){
                    sum_firsthalf+=arg.charAt(j)-'0';
                    sum_secondhalf+=arg.charAt(arg.length()-j-1)-'0';
                }
                if(sum_firsthalf==sum_secondhalf) count++;
            }
            System.out.println(count+9);
        }
    }
}
