import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_maxmodulo {
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        int l=in.nextInt(),r=in.nextInt();in.close();
        System.out.println((l>(r/2+1))?r%l:r%((r/2)+1));
    }
}
