import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_swapAB {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),l=n-1,r=0;
        String s=sc.next();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='A'){
                l=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='B'){
                r=i;
                break;
            }
        }
        System.out.println(Math.max(0,r-l));
    }
}
