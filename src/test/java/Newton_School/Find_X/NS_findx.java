import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

publi class NS_findx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong(),x=sc.nextLong(),count=0;sc.close();
        if(n*n==x) {System.out.println(1);return;}
        for(long i=1;i*i<=x;i++){
            if(x%i==0 && x/i<=n){
                count++;
                if(i!=x/i) count++;
            }
        }
        System.out.println(count);
    }
}
