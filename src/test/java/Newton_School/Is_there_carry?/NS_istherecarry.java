import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_istherecarry {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next(),s2=sc.next();
        int n1=s1.length(),n2=s2.length();
        boolean flag=false;
        if(n1>n2) s2="0".repeat(n1-n2)+s2;
        else s1="0".repeat(n2-n1)+s1;
        for(int i=n1-1;i>=0;i--){
            int result=(s1.charAt(i)-'0')+(s2.charAt(i)-'0');
            if(result>9){flag=true;break;}
        }
        System.out.println(flag?"Yes":"No");
    }
}
