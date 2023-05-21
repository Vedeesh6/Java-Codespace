import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_piles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),k=0;boolean flag=true;
        for (int i = 0; i < n; i++) {
            int arg = scanner.nextInt();
            if(arg!=1){flag=false;}
            if(flag && arg==1){k++;}
        }
        scanner.close();
        System.out.println((k%2!=0 || k==n)?"Second":"First");
    }
}
