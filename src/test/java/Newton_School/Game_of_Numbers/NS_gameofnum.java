import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_gameofnum {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();sc.close();
        System.out.println((m>=n)?(n%2==0)?"Ram":"Rahul":(m%2==0)?"Shyam":"Rahul");
    }
}
