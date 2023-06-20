import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_specialnum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n>45){
            System.out.println(-1);
        }else{
            StringBuilder sb=new StringBuilder();
            int counter=9;
            while(n>0){
                if(n>counter){
                    sb.append(counter);
                    n-=counter;
                }else{
                    sb.append(n);
                    n=0;
                }
                counter--;
            }
            System.out.println(sb.reverse().toString());
        }
    }
}
