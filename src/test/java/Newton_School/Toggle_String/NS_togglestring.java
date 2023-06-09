import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_togglestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next(),s1="";sc.close();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                s1+=(char)(s.charAt(i)+32);
            }
            else if(s.charAt(i)>=97 && s.charAt(i)<=122){
                s1+=(char)(s.charAt(i)-32);
            }
        }
        System.out.println(s1);
    }
}
