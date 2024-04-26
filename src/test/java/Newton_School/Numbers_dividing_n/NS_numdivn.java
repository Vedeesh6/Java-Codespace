import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_numdivn {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),x=(int)Math.sqrt(n),count=0;
        for(int i=1;i<=x;i++){
            if(n%i==0){
                count++;
                if(n/i!=i) count++;
            }
        }
        System.out.println(count);
    }
}
