import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_printstr {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<26;i++) System.out.print((char)(sc.nextInt()+96));
    }
}
