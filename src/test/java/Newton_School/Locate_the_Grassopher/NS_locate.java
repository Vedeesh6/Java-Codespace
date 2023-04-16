import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_locate {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long x=sc.nextLong(),n=sc.nextLong();
        boolean flag=false;
        if(n%2!=0){flag=true;n-=1;}
        long fin;
        if(n%4==0){fin=x;}else{fin=(x%2==0)?x+1:x-1;}
        if(flag){
            fin=(fin%2==0)?fin-n-1:fin+n+1;
        }
        System.out.println(fin);
    }
}
