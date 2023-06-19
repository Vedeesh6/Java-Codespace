import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class NS_specialsum {
    static ArrayList<Integer> sieveofpowerof2;
    static int MAX=1000000000;

    static void sieve(){
        sieveofpowerof2=new ArrayList<>();
        int i=1;
        while(i<=MAX){
            sieveofpowerof2.add(i);
            i*=2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sieve();
        long n=sc.nextLong();sc.close();
        long ans=n*(n+1)/2;
        long sum=0;
        for(int i=0;i<sieveofpowerof2.size();i++){
            if(sieveofpowerof2.get(i)<=n){
                sum+=sieveofpowerof2.get(i);
            }
        }
        System.out.println(ans-2*sum);
    }
}
