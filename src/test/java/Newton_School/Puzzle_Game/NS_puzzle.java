import java.util.*;

public class NS_puzzle { 
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();sc.close();
        System.out.println((a>b)?0:1+b-a);
    }
}
