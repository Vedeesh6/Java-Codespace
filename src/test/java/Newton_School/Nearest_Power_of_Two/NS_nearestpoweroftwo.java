import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_nearestpoweroftwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),prev=n-1;
        if(!isPowerOfTwo(n)){
            while(true){
                if(isPowerOfTwo(prev)){
                    System.out.println(prev);
                    break;
                }
                if(isPowerOfTwo(n)){
                    System.out.println(n);
                    break;
                }
                prev--;
                n++;
            }
        }else{
            System.out.println(n);
        }
    }

    static boolean isPowerOfTwo(int x){
        return x != 0 && ((x & (x - 1)) == 0);
    }
}
