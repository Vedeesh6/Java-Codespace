import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_sumsumint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),sum=0;
        for(int i=1;i<=n;i++){
            sum+=sumofdigits(i);
        }
        System.out.println(sum);
    }

    public static int sumofdigits(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
