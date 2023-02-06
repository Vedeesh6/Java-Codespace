import java.util.*;

public class Test_NS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();String s=sc.next();sc.close();
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int c=((( s.charAt(i))-64+n)%26);
            if(c==0){s1.append('Z');continue;}
            s1.append((char) (c+64));
        }
        System.out.println(s1.toString());
    }
    
}