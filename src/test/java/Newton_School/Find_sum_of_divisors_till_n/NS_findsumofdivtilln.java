import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_findsumofdivtilln {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();long sum=0;
        for(int i=1;i<=n;i++){
            sum+=divsum(i);
        }
        System.out.println(sum);
    }

    public static long divsum(int n){
        long sum=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                sum+=i;
                if(i!=n/i){
                    sum+=n/i;
                }
            }
        }
        return sum;
    }
}
