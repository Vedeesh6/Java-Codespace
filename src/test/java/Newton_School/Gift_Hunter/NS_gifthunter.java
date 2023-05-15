import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_gifthunter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(),l=sc.nextInt(),x=0,y=0;
        String path=sc.next();sc.close();
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='L'){
                x--;
            }
            else if(path.charAt(i)=='R'){
                x++;
            }
            else if(path.charAt(i)=='U'){
                y++;
            }
            else if(path.charAt(i)=='D'){
                y--;
            }
            if(x==k && y==l) break;
        }
        System.out.println(x==k && y==l?"YES":"NO");
    }
}
