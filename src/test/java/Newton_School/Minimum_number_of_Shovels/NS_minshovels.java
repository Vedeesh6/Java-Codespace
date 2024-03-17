import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_minshovels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        long priceMade = 0;
        int k, r;
        k = scanner.nextInt();
        r = scanner.nextInt();
        boolean flag = true;
        while (flag) {
            if ((priceMade % 10 == 0 && priceMade != 0) || priceMade % 10 == r) {
                break;
            }
            ++value;
            priceMade += k;
        }
        System.out.println(value);
    }
}
