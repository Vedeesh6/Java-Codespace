import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_findifdiv {
    public static void main(String[] args) {
        System.out.println(divisiblebysumofdig(new Scanner(System.in).nextInt())?"Yes":"No");
    }

    public static boolean divisiblebysumofdig(int n){
        int sum = 0;
        int temp = n;
        while(temp>0){
            sum += temp%10;
            temp /= 10;
        }
        return n%sum==0;
    }
}
