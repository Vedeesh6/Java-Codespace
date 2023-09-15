import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class NS_taracandy{
    static int countRec(int choc)
    {
        if (choc < 3)
            return 0;
        int newChoc = choc / 3;
        return newChoc + countRec(newChoc+choc%3);
    }
    static int countMaxChoco(int money)
    {
        return money + countRec(money);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(countMaxChoco(sc.nextInt()));
    }
}
