import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_findd {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        for(int i=a;i<=b;i++){
            if(i%c==0){
                System.out.println(i);return;
            }
        }
        System.out.println(-1);
    }
}
