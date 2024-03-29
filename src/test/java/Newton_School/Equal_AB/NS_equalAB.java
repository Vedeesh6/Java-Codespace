import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class NS_equalAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(((a&b)!=a?1:0)+((a&b)!=b?1:0));
    }
}
