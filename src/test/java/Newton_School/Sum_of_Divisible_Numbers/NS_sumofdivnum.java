import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_sumofdivnum{
    static int sum(int N){

        int S1 = ((N / 3)) * (2 * 3 + (N / 3 - 1) * 3) / 2;
        int S2 = ((N / 2)) * (2 * 2 + (N / 2 - 1) * 2) / 2;
        int S3 = ((N / 7)) * (2 * 7 + (N / 7 - 1) * 7) / 2;
        int S12 = ((N / 6)) * (2 * 6 + (N / 6 - 1) * 6) / 2;
        int S13 = ((N / 21)) * (2 * 21 + (N / 21 - 1) * 21) / 2;
        int S23 = ((N / 14)) * (2 * 14 + (N / 14 - 1) * 14) / 2;
        int S123 = ((N / 42)) * (2 * 42 + (N / 42 - 1) * 42) / 2;

        return S1 + S2 + S3 - S12 - S13 - S23 + S123;
    }

    public static void main(String[] args) {
        System.out.println(sum(new Scanner(System.in).nextInt()));
    }
}
