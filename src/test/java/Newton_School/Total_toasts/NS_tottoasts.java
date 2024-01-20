import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class you can add inner classes if needed
class NS_tottoasts{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt(),l=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt(),p=sc.nextInt(),nl=sc.nextInt(),np=sc.nextInt();
        System.out.println(Math.min(Math.min((k*l)/nl,c*d),p/np)/n);
    }
}
