import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_wordwisdom{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),max=0,id=0;
        for(int i=0;i<n;i++){
            int pass=sc.nextInt(),score=sc.nextInt();
            if(pass<=10){
                if(score>max){
                    max=score;id=i+1;
                }
            }
        }sc.close();
        System.out.println(id);    
    }
}
