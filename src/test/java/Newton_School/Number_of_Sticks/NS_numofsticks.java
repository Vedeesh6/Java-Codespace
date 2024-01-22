import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class NS_numofsticks {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n/2+(n%2));
    }
}
