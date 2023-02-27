import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_findingcharacter {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt(),count=(k%2==0)?k/n:(n==1)?k/n:k/n+1;
        System.out.println((char) (64+count));
    }
}
