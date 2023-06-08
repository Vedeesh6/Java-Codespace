import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_zoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();sc.close();
        int n=s.length(),count_z=0,count_o=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='z'){count_z++;}
            else if(s.charAt(i)=='o'){count_o++;}
        }
        System.out.println((count_o%2!=0)?"No":(count_z==count_o/2?"Yes":"No"));
    }
}
