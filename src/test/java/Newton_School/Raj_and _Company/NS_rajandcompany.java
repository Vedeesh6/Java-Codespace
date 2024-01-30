import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class NS_rajandcompany {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt(),ways=(n>=2)?1:0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                if(i!=n/i) ways+=2;
                else ways++;
            }
        }
        System.out.println(ways);
    }
}
