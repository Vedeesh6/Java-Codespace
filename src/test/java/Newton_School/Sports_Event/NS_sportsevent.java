import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_sportsevent{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int year=sc.nextInt();
        if(year%4==0){
            System.out.println(year+2);
        }else if(year%4==1){
            System.out.println(year+1);
        }else if(year%4==2){
            System.out.println(year);
        }else{
            System.out.println(year+3);
        }
    }
}
