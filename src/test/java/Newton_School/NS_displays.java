import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_displays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),b=0,i=(int)Math.sqrt(n);
        for(;i>=0;i--){
            if(n%i==0){
                b=i;
                break;
            }
        }
        System.out.println(b+" "+(n/b));
    }
}
