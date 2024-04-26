import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_divby200 {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong(); int k=sc.nextInt();
        while(k-->0){
            if(n%200==0){
                n/=200;continue;
            }else{
                n=Long.parseLong(n+"200");
            }
        }
        System.out.println(n);
    }
}
