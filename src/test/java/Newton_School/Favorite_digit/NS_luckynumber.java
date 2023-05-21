import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_luckynumber {
    public static boolean lucky(int n, int d) {
        int num = n;
        while(num!=0){
            int y = num%10;
            num/=10;
            if(y==d){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int d = scanner.nextInt();

        if(d==1){
            for(int i=0;i<n;i++){
                int number = scanner.nextInt();
                System.out.println("YES");
            }
            scanner.close();
            return;
        }

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();

            if (lucky(number, d)) {
                System.out.println("YES");
            } else {
                boolean flag = false;
                for (int j = d; j <= number; j+=d) {
                    if (lucky(number - j, d)) {
                        flag = true;
                        break;
                    }
                }
                System.out.println(flag ? "YES" : "NO");
            }
        }
        scanner.close();
    }
}
