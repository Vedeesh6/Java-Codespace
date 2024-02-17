import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_insightfull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),ans=0,index=0;
        for(int i=0;i<n;i++){
            int a = sc.nextInt(),b = sc.nextInt();
            if(a<=10 && ans<b){
                ans = b;index = i+1;
            }
        }
        sc.close();
        System.out.println(index);
    }
}
