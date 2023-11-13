import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_sepdigits{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            printdigits(sc.nextInt()+"");
        }
        sc.close();
    }

    public static void printdigits(String s){
        int n=s.length();
        for(int i=0;i<n;i++){
            System.out.print(s.charAt(i)+" ");
        }
    }
}
