import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_nonadjsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),sum=0,sum_1=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                sum+=sc.nextInt();
            }else{
                sum_1+=sc.nextInt();
            }
        }
        System.out.println(Math.max(sum,sum_1));
    }
}
