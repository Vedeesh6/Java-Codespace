import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_primejustlessthannum {
    static ArrayList<Integer> sieve= new ArrayList<>();

    public static void sieve(int n){
        boolean prime[]=new boolean[n+1];
        for(int i=0;i<=n;i++){
            prime[i]=true;
        }
        for(int p=2;p*p<=n;p++){
            if(prime[p]==true){
                for(int i=p*p;i<=n;i+=p){
                    prime[i]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(prime[i]==true){
                sieve.add(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sieve(n);
        System.out.println(sieve.get(sieve.size()-1));
    }
}
