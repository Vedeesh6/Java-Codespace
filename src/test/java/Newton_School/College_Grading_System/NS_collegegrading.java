import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_collegegrading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] A = new double [n];
        for(int i = 0; i < n; i++) {
            double sum = 0;
            for(int j = 0; j < 4; j++)
                sum += sc.nextDouble();
            A[i] = sum/4;
        }sc.close();
        double arg=Arrays.stream(A).sum()/n;
        System.out.println((arg>=8.5?"A":arg>=7.0?"B":"C"));
    }
}
