import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_noofextneed {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        if(b==1){System.out.println(0);return;}
        b-=a;
        System.out.println(b<=0?1:b/(a-1)+(b%(a-1)==0?0:1)+1);
    }
}
