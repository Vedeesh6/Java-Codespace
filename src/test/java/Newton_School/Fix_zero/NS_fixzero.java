import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_fixzero {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++) if(sc.nextInt()==0){System.out.print(i);break;}
    }
}
