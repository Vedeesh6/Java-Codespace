import java.util.*;

public class CardShuffle {
    public static void main(String[] args) {
        System.gc();                               //needed because of useless test case constraints
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int eSum = 2*(N * (N + 1)),aSum =0,input;
        for (int i = 0; i < 4 * N - 1; i++) {
            input = scan.nextInt();
            aSum += input;
        }
        scan.close();
        System.out.println(eSum - aSum);
    }
    
}
