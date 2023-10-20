import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_optimalgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.println(a>b?"Ritik":a<b?"Vikas":sc.nextInt()%2==1?"Ritik":"Vikas");
    }
}
