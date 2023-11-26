import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_prodnonprime {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String num=sc.next();long multiplier=1;sc.close();
        int len=num.length();
        HashSet<Integer> prime=new HashSet<>();
        prime.add(2);prime.add(3);prime.add(5);prime.add(7);
        for(int i=0;i<len;i++){
            int digit=num.charAt(i)-'0';
            if(!prime.contains(digit)) multiplier*=digit;
        }
        System.out.println(multiplier);
    }
}
