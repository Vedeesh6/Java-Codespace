import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.math.*;

public class NS_dividemangoes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_of_mangoes = sc.nextInt(), no_of_students = sc.nextInt();sc.close();

        // special cases
        if(no_of_mangoes == 0 || no_of_students == 0 || no_of_mangoes == no_of_students || no_of_mangoes%no_of_students == 0 ) {
            System.out.println("Yes");
            return;
        }

        //check solution
        BigDecimal arg;
        try{
            arg = new BigDecimal(no_of_mangoes).divide(new BigDecimal(no_of_students));
        }catch(Exception e){
            System.out.println("No");
            return;
        }
        String ans=arg.toPlainString();
        //System.out.println(ans);
        System.out.println(ans.charAt(ans.length()-1) == '5' ? "Yes" : "No");
    }
}
