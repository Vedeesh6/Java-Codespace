import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_findtargetinleaststeps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),count=0;
        while(n>1){
            if(n%2==0){
                n/=2;
            }
            else{
                n--;
            }
            count++;
        }
        System.out.println(count+1);
    }
}
