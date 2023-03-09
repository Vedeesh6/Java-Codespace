import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_alexagolf {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt(),b=sc.nextInt();sc.close();
        for(int i=a;i<=b;i++){
            if(i%n==0){
                System.out.println("OK");
                return;
            }
        }System.out.println("NG");
    }
}
