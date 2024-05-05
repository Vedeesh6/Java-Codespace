import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_stairpeak {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),flag=3;
        if(a<b && b<c) flag=1;
        else if(a<b && b>c) flag=2;
        System.out.println(flag==1?"Stair":flag==2?"Peak":"Nothing");
    }
}
