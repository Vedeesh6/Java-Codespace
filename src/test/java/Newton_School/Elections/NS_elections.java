import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_elections {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();sc.close();
        int max=Math.max(a,Math.max(b,c))+1;
        if(a==b && b==c){System.out.println((max-a)+" "+(max-b)+" "+(max-c));}
        else{
            int term1=max-a,term2=max-b,term3=max-c;
            System.out.println(((term1==1)?0:term1)+" "+((term2==1)?0:term2)+" "+((term3==1)?0:term3));
        }
    }
}
