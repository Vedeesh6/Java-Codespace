import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_mighty7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String num=sc.next();int count_7=0;
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)=='7'){
                count_7++;
            }
        }
        System.out.println(count_7);
    }
}
