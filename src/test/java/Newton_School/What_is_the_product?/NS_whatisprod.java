import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_whatisprod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();long prod=1;sc.close();
        for(int i=0;i<n.length();i++){
            int dig=n.charAt(i)-'0';
            if(dig!=2 && dig!=3 && dig!=5 && dig!=7){
                prod*=dig;
            }
        }
        System.out.println(prod);
    }
}
