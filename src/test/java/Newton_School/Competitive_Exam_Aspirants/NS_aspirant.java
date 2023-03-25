import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_aspirant {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int upper=sc.nextInt();int lower=sc.nextInt();int age=sc.nextInt();
        System.out.println((age<=upper && age>=lower)? "Yes":"No");sc.close();
    }
}
