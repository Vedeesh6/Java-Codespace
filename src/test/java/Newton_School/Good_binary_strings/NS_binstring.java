import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_binstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            long n = sc.nextLong(),count_1=0,count_0=0,count_01=0;
            for(int i=0;i<n;i++){
                String s=sc.next();
                if(s.contains("0") && s.contains("1")){count_01++;}
                if(s.contains("0")){count_0++;}
                if(s.contains("1")){count_1++;}
            }
            System.out.println((count_0*(count_0-1))/2 + (count_1*(count_1-1))/2 - (count_01*(count_01-1))/2);
        }sc.close();
    }
}
