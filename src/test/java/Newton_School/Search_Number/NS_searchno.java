import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_searchno{
    public static long find(long N)
    {
        if(N==0 || N==5){
            return 9;
        }
        else if(N==1){
            return 1;
        }
        else if(N==2){
            return 3;
        }
        else if(N==3){
            return 5;
        }
        else if(N==4){
            return 7;
        }
        else{
            if(N%5==0)
                return(10*find((N/5)-1)+9);
            return(10*find(N/5)+find(N%5));
        }
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(find(sc.nextLong()));
    }
}
