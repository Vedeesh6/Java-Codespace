import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_dicegame {
    public static void main (String[] args) {
        Scanner sc=new  Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt();
        System.out.println((a*6>=b && b>=a)?"Yes":"No");
    }
}
