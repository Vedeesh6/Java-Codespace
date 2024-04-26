import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_xorofdiv {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long xor=n%2==0?n:0,x=(long)Math.sqrt(n);
        for(int i=2;i<=x;i++){
            if(n%i==0){
                if(i%2==0) xor^=i;
                if((n/i)!=i && (n/i)%2==0) xor^=(n/i);
            }
        }
        System.out.println(xor);
    }
}
