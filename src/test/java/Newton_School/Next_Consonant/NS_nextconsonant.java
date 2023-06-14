import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class NS_nextconsonant {
    public static void main(String[] args) {
        System.gc();
        Scanner sc = new Scanner(System.in);
        int len=sc.nextInt();
        String s=sc.next(),s1="";sc.close();
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                s1+=(char)((int)s.charAt(i)+1);
            }else{
                s1+=s.charAt(i);
            }
        }
        System.out.println(s1);
    }
}
